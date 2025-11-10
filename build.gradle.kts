// ===== 버전/공통 상수 =====
val artifactBaseName = "nova-shared-shared-biz"

val vNovaShared         = "0.1.0-SNAPSHOT"
val vSpringBoot         = "3.5.4"
val vSpringModulith     = "1.4.2"
val vSpringDataBom      = "2024.1.4"
val vLombok             = "1.18.38"
val vJunit              = "5.10.0"
val vMapstruct          = "1.5.5.Final"
val vQuerydsl           = "5.1.0"
val vJakartaAnnotation  = "2.1.1"
val vJakartaPersistence = "3.1.0"
val vSpringdoc          = "2.8.6"

subprojects {
    group = "com.skt.bss.nova"
    if (file("src").exists() || project.path.startsWith(":library:")) {
        apply(plugin = "java-library")

        extensions.configure<JavaPluginExtension> {
            toolchain {
                languageVersion.set(JavaLanguageVersion.of(21))
            }
        }

        // 공통 repositories 설정
        repositories {
           if (!System.getenv("NEXUS_PUBLIC_URL").isNullOrBlank()) {
               mavenCentral()
               maven {
                   url = uri(System.getenv("NEXUS_PUBLIC_URL"))
                   isAllowInsecureProtocol = true
               }
               maven {
                   url = uri(System.getenv("NEXUS_RELEASE_URL"))
                   isAllowInsecureProtocol = true
                   credentials {
                       username = System.getenv("NEXUS_USERNAME")
                       password = System.getenv("NEXUS_PASSWORD")
                   }
               }
               maven {
                   url = uri(System.getenv("NEXUS_SNAPSHOT_URL"))
                   isAllowInsecureProtocol = true
                   credentials {
                       username = System.getenv("NEXUS_USERNAME")
                       password = System.getenv("NEXUS_PASSWORD")
                   }
               }
           } else {
                mavenCentral()
                mavenLocal()
           }
        }

        // 공통 dependencies 설정
        dependencies {
            add("implementation", "com.skt.bss.nova:nova-base-shared-kernel:$vNovaShared")

            add("implementation", platform("org.springframework.boot:spring-boot-dependencies:$vSpringBoot"))
            add("implementation", platform("org.springframework.modulith:spring-modulith-bom:$vSpringModulith"))
            add("implementation", platform("org.springframework.data:spring-data-bom:$vSpringDataBom"))
            add("implementation", "org.springframework.modulith:spring-modulith-runtime")

            add("compileOnly", "org.projectlombok:lombok:$vLombok")
            add("annotationProcessor", "org.projectlombok:lombok:$vLombok")
            add("testCompileOnly", "org.projectlombok:lombok:$vLombok")
            add("testAnnotationProcessor", "org.projectlombok:lombok:$vLombok")

            add("testImplementation", platform("org.junit:junit-bom:$vJunit"))
            add("testImplementation", "org.junit.jupiter:junit-jupiter")
            add("testRuntimeOnly", "org.junit.platform:junit-platform-launcher")

            constraints {
                add("implementation", "com.skt.bss.nova:nova-base-shared-framework:$vNovaShared")
                add("implementation", "com.skt.bss.nova:nova-base-shared-util:$vNovaShared")
                add("annotationProcessor", "com.skt.bss.nova:nova-base-shared-processor:$vNovaShared")
                add("implementation", "org.mapstruct:mapstruct:$vMapstruct")
                add("annotationProcessor", "org.mapstruct:mapstruct-processor:$vMapstruct")
                add("implementation", "com.querydsl:querydsl-jpa:$vQuerydsl")
                add("annotationProcessor", "com.querydsl:querydsl-apt:$vQuerydsl:jakarta")
                add("annotationProcessor", "jakarta.annotation:jakarta.annotation-api:$vJakartaAnnotation")
                add("annotationProcessor", "jakarta.persistence:jakarta.persistence-api:$vJakartaPersistence")
                add("implementation", "org.springdoc:springdoc-openapi-starter-webmvc-ui:$vSpringdoc")
            }
        }

        // 공통 publishing 설정
        if (listOf("service").none { it in project.path }) {
            apply(plugin = "maven-publish")

            extensions.configure<PublishingExtension> {
                publications {
                    create<MavenPublication>("maven") {
                        from(components["java"])

                        when {
                            project.path.startsWith(":library:") -> {
                                artifactId = "${project.name}"
                            }
                            project.path.contains(":contract:") ||
                                    project.path.contains(":infra:") ||
                                        project.path.contains(":presentation:") ||
                                            project.path.contains(":client")-> {
                                artifactId = artifactBaseName +
                                        "-${project.parent?.parent?.name}" +
                                        "-${project.parent?.name}-${project.name}"
                            }
                            else -> {
                                artifactId = artifactBaseName +
                                        "-${project.parent?.name}-${project.name}"
                            }
                        }
                    }
                }

                repositories {
                    if (!System.getenv("NEXUS_PUBLIC_URL").isNullOrBlank()) {
                        maven {
                            url = uri(System.getenv("NEXUS_SNAPSHOT_URL"))
                            isAllowInsecureProtocol = true
                            credentials {
                                username = System.getenv("NEXUS_USERNAME")
                                password = System.getenv("NEXUS_PASSWORD")
                            }
                        }
                    } else {
                        mavenLocal()
                    }
                }
            }
        }
    }

    configurations.all {
        resolutionStrategy {
            cacheChangingModulesFor(0, "seconds")
            cacheDynamicVersionsFor(0, "seconds")
        }
    }
}
