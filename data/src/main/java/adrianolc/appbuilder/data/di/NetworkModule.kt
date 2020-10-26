package adrianolc.appbuilder.data.di

import adrianolc.appbuilder.data.remote.service.BranchService
import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

internal val network = module {
    factory {
        okHttpClient()
    }

    single {
        retrofit(get())
    }

    factory {
        branchService(get())
    }
}

private fun branchService(retrofit: Retrofit): BranchService {
    return retrofit.create(BranchService::class.java)
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
        .loggable(true)
        .setLevel(Level.BASIC)
        .log(Platform.INFO)
        .request("Request")
        .response("Response")
        .build()
}