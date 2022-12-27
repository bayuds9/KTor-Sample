package com.flowerencee.models.remote

import com.flowerencee.models.data.body.ImageData
import com.flowerencee.models.data.body.Product
import com.flowerencee.models.data.request.CreateProductRequest
import com.flowerencee.models.databases.DatabaseManager
import com.flowerencee.models.repositories.ProductRepository
import com.flowerencee.plugins.convertToImageFile
import com.flowerencee.plugins.deleteImageFile
import com.flowerencee.plugins.encodeFileToBase64
import com.flowerencee.plugins.productDirectory

class ProductRemote() : ProductRepository {

    private val database = DatabaseManager()
    override fun createProduct(request: CreateProductRequest): String {
        return database.createProduct(request)
    }

    override fun storeProductImage(image64: ArrayList<String>, productId: String): Boolean {
        val successStore: ArrayList<Boolean> = ArrayList()
        image64.forEachIndexed { index, s ->
            if (s.isNotEmpty()) {
                val fileName = "product$productId$index.png"
                val store = s.convertToImageFile(productDirectory(), fileName)
                when (store?.isNotEmpty()) {
                    true -> {
                        val success = database.insertProductImages(fileName, productId)
                        successStore.add(success)
                    }

                    else -> successStore.add(false)
                }
            }
        }
        return if (successStore.isNotEmpty()) successStore.any { it }
        else false
    }

    override fun validateMerchantId(merchantId: String): Boolean {
        return database.validateMerchantId(merchantId)
    }

    override fun getProduct(productId: String): Product? {
        val data = database.getProduct().firstOrNull { it.productId == productId }
        return if (data != null) {
            val imageFiles = database.getProductImages(productId)
            val imageList = ArrayList<ImageData>()
            imageFiles.forEach { file ->
                (productDirectory() + "/" + file).encodeFileToBase64()?.let {
                    imageList.add(ImageData(file, it))
                }
            }
            Product(
                productId = productId,
                productName = data.productName,
                productStock = data.productStock,
                productPrice = data.productPrice,
                productDesc = data.productDesc,
                productCategory = data.category,
                merchantId = data.merchantId,
                createdAt = data.createdAt,
                productImage = imageList
            )
        } else null
    }

    override fun getProductList(merchantId: String?): ArrayList<Product> {
        val data = if (merchantId != null) database.getProduct()
            .filter { it.merchantId == merchantId } else database.getProduct()
        val result = ArrayList<Product>()
        data.forEach {
            val product = getProduct(it.productId)
            if (product != null) result.add(product)
        }
        return result
    }

    override fun validateMerchantAccount(profileId: String, merchantId: String): Boolean {
        return database.validateMerchantAccount(profileId, merchantId)
    }

    override fun validateProductData(productId: String, merchantId: String): Boolean {
        return database.validateProductData(productId, merchantId)
    }

    override fun deleteProductImage(productName: String, productId: String): Boolean {
        val deleteFromDB = database.deleteProductImage(productName, productId)
        if (deleteFromDB) {
            try {
                productName.deleteImageFile(productDirectory())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        print("deleted $deleteFromDB")
        return deleteFromDB
    }
}