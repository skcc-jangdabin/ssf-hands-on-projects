version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":func-partyservice:contract:api"))
    implementation(project(":func-partyservice:domain"))

    implementation("com.skt.bss.nova:nova-base-shared-framework")

    implementation("org.springframework:spring-context")

    implementation("org.mapstruct:mapstruct")
    annotationProcessor("org.mapstruct:mapstruct-processor")
}
