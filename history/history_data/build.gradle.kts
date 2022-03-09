apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.history_domain))

    // Retrofit: Remote API
    "implementation"(Retrofit.okHttp)
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.okHttpLoggingInterceptor)
    "implementation"(Retrofit.moshiConverter)

    // Room: Local Database
    "kapt"(Room.roomCompiler)
    "implementation"(Room.roomKtx)
    "implementation"(Room.roomRuntime)
}

// Dependencies: Data, Presentation should import Domain
// Data <- Domain -> Presentation

// Only Data layer should import Retrofit, Room for Remote API, Local Database