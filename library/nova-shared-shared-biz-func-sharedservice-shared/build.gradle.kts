version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":func-sharedservice:domain"))
    api(project(":func-sharedservice:application"))
    api(project(":func-sharedservice:infra:adapter-jpa"))
}
