version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":func-partyservice:contract:api"))
    api(project(":func-partyservice:application"))
    api(project(":func-partyservice:domain"))
    api(project(":func-partyservice:infra:adapter-jpa"))
    api(project(":func-partyservice:presentation:adapter-rest"))
    api(project(":func-partyservice:client:adapter-client-rest"))
}
