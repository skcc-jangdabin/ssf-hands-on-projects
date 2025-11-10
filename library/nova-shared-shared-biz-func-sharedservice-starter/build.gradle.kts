version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":func-sharedservice:contract:api"))
    api(project(":func-sharedservice:application"))
    api(project(":func-sharedservice:domain"))
    api(project(":func-sharedservice:infra:adapter-jpa"))
    api(project(":func-sharedservice:presentation:adapter-rest"))
    api(project(":func-sharedservice:client:adapter-client-rest"))
}
