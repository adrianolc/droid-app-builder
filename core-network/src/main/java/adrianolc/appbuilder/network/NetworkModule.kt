package adrianolc.appbuilder.network

import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val networkModule = module {
    factory {
        okHttpClient()
    }

    single {
        retrofit(get())
    }
}

private fun retrofit(httpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl("http://10.0.2.2")
        .client(httpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}

private fun okHttpClient(): OkHttpClient {
    return OkHttpClient()
        .newBuilder()
        .addInterceptor(loggingInterceptor())
        .build()
}

private fun loggingInterceptor(): LoggingInterceptor {
    return LoggingInterceptor.Builder()
        .setLevel(Level.BASIC)
        .log(Platform.INFO)
        .request("Request")
        .response("Response")
        .build()
}