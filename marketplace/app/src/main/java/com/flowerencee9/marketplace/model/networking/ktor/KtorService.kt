package com.flowerencee9.marketplace.model.networking.ktor

import android.content.Context
import android.util.Log
import com.flowerencee9.marketplace.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.gson.*
import java.util.concurrent.TimeUnit

interface KtorService {
    suspend fun callGetHttp(httpRequestBuilder: HttpRequestBuilder): HttpResponse?
    suspend fun callPostHttp(httpRequestBuilder: HttpRequestBuilder, request: Any): HttpResponse?

    companion object {
        fun create(context: Context): KtorService {
            /*val baseParam = ParametersBuilder(1)
            baseParam.append(Constants.PARAM.API_KEY, BuildConfig.API_KEY)*/
            return KtorServiceImp(
                client = HttpClient(OkHttp) {
                    engine {
                        /*if (BuildConfig.DEBUG) {
                            val chuckerInterceptor = ChuckerInterceptor.Builder(context)
                                .collector(ChuckerCollector(context))
                                .maxContentLength(250000L)
                                .redactHeaders(emptySet())
                                .alwaysReadResponseBody(false)
                                .build()
                            addInterceptor(chuckerInterceptor)
                        }*/
                        config {
                            followRedirects(true)
                            readTimeout(30, TimeUnit.SECONDS)
                            connectTimeout(30, TimeUnit.SECONDS)
                            callTimeout(30, TimeUnit.SECONDS)
                        }
                    }
                    defaultRequest {
                        host = BuildConfig.BASE_URL
                        url {
                            protocol = URLProtocol.HTTP
                        }
                        port = 8080
                    }
                    install(Logging) {
                        logger = object : Logger {
                            override fun log(message: String) {
                                Log.v("Logger Ktor =>", message)
                            }

                        }
                        level = LogLevel.ALL
                    }
                    install(ContentNegotiation) {
                        gson {
                            setPrettyPrinting().toString()
                        }
                    }
                }
            )
        }
    }
}