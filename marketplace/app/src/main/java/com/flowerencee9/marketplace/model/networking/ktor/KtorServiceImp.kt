package com.flowerencee9.marketplace.model.networking.ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class KtorServiceImp (
    private val client: HttpClient
        ) : KtorService {
    override suspend fun callGetHttp(httpRequestBuilder: HttpRequestBuilder): HttpResponse? {
        return try {
            client.get {
                url {
                    appendPathSegments(httpRequestBuilder.url.pathSegments)
                    parameters.appendAll(httpRequestBuilder.url.parameters.build())
                }
            }.body()
        } catch (e: RedirectResponseException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: ClientRequestException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: ServerResponseException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun callPostHttp(
        httpRequestBuilder: HttpRequestBuilder,
        request: Any
    ): HttpResponse? {
        return try {
            client.post {
                url {
                    appendPathSegments(httpRequestBuilder.url.pathSegments)
                }
                contentType(ContentType.Application.Json)
                setBody(request)
            }.body()
        } catch (e: RedirectResponseException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: ClientRequestException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: ServerResponseException) {
            e.printStackTrace()
            e.response.body()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

}