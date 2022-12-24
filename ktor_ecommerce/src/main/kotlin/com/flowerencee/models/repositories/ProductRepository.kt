package com.flowerencee.models.repositories

import com.flowerencee.models.data.body.Product
import com.flowerencee.models.data.request.CreateProductRequest

interface ProductRepository {
    fun createProduct(request: CreateProductRequest) : String
    fun storeProductImage(image64: ArrayList<String>, productId: String): Boolean
    fun validateMerchantId(merchantId: String): Boolean
    fun getProduct(productId: String): Product?
    fun getProductList(merchantId: String? = null) : ArrayList<Product>
}