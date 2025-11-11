version = "0.0.1-SNAPSHOT"

configurations.named("compileOnly") {
    extendsFrom(configurations.named("annotationProcessor").get())
}

dependencies {
    implementation(project(":func-partyservice:contract:api"))
    implementation(project(":func-partyservice:application"))
    implementation(project(":func-partyservice:domain"))

    implementation("com.skt.bss.nova:nova-base-shared-framework")
    implementation("com.skt.bss.nova:nova-base-shared-util")

    implementation("org.mapstruct:mapstruct")
    annotationProcessor("org.mapstruct:mapstruct-processor")

    implementation("org.springframework.data:spring-data-jpa")
    implementation("jakarta.persistence:jakarta.persistence-api")

    implementation("com.querydsl:querydsl-jpa")
    annotationProcessor("com.querydsl:querydsl-apt::jakarta")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")
}
