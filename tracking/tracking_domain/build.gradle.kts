apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
}

// Dependencies: Data, Presentation should import Domain
// Data <- Domain -> Presentation