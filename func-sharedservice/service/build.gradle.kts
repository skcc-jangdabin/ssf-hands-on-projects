plugins {
    id("org.springframework.boot") version "3.5.4"
    id("io.spring.dependency-management") version "1.1.7"
}

version = "0.0.1-SNAPSHOT"

tasks.named<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

dependencies {
    implementation(project(":func-sharedservice:domain"))
    implementation(project(":func-sharedservice:application"))
    implementation(project(":func-sharedservice:presentation:adapter-rest"))
    implementation(project(":func-sharedservice:infra:adapter-jpa"))
    implementation(project(":func-sharedservice:contract:api"))
    implementation(project(":func-sharedservice:client:adapter-client-rest"))

    implementation("com.skt.bss.nova:nova-base-shared-framework")
    annotationProcessor("com.skt.bss.nova:nova-base-shared-processor")

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("com.querydsl:querydsl-jpa:5.1.0:jakarta")

    runtimeOnly("org.postgresql:postgresql:42.7.5")
    implementation("p6spy:p6spy:3.9.1")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui")

}
