version = "0.0.1-SNAPSHOT"

// Java 컴파일 시 메소드 파라미터 이름을 .class 파일에 포함시킴
// reflection에서 파라미터 이름을 사용할 수 있음
// swagger에서 파라미터 이름을 나오도록 하기 위해서 사용했음
tasks.withType<JavaCompile> {
    options.compilerArgs.add("-parameters")
}

dependencies {
    implementation(project(":func-partyservice:contract:api"))
    implementation(project(":func-partyservice:application"))

    implementation("com.skt.bss.nova:nova-base-shared-util")
    implementation("com.skt.bss.nova:nova-base-shared-framework")
    annotationProcessor("com.skt.bss.nova:nova-base-shared-processor")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui")
}
