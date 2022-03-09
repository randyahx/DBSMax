apply {
    from("$rootDir/compose-module.gradle")
} // Presentation layers import from compose-module instead of base-module
// compose-module contains UI dependencies

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.settings_domain))

    "implementation"(project(Modules.coreUi))
    "implementation"(Coil.coilCompose)
}

// Dependencies: Data, Presentation should import Domain
// Data <- Domain -> Presentation