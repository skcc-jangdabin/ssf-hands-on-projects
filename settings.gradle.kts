rootProject.name = "nova-education-edcuation-handson"
include (
    "func-partyservice",
    "func-partyservice:application",
    "func-partyservice:contract:api",
    "func-partyservice:presentation:adapter-rest",
    "func-partyservice:service",
    "func-partyservice:client:adapter-client-rest",
    "func-partyservice:domain",
    "func-partyservice:infra:adapter-jpa",
)

// Library 모듈
include("library:nova-education-education-handson-starter")
include("library:nova-education-education-handson-func-partyservice-starter")
include("library:nova-education-education-handson-func-partyservice-shared")
