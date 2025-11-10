rootProject.name = "nova-shared-shared-biz"
include (
    "func-sharedservice",
    "func-sharedservice:application",
    "func-sharedservice:contract:api",
    "func-sharedservice:presentation:adapter-rest",
    "func-sharedservice:service",
    "func-sharedservice:client:adapter-client-rest",
    "func-sharedservice:domain",
    "func-sharedservice:infra:adapter-jpa",
)

// Library 모듈
include("library:nova-shared-shared-biz-starter")
include("library:nova-shared-shared-biz-func-sharedservice-starter")
include("library:nova-shared-shared-biz-func-sharedservice-shared")
