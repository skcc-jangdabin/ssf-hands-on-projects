version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":func-partyservice:domain"))
    api(project(":func-partyservice:application"))
    api(project(":func-partyservice:infra:adapter-jpa"))
}
