Add new macro
=============

The endpoint creating temporary macro is available at
```
POST {git4c-backend-url}/
```

Temporary macro is based on already existing macro, so you can create it by passing uuid of a macro and a branch name.

The payload of the request should be a JSON with branch information.
Class that specifies branch.
```
data class Branch(
    val branch: String
)
```


#### Example request and response
```
Request URL:
    http://naatlas-confluence.openstack.local:8090/rest/doc/1.0/documentation/13e022d6cb1442c9ab7c8148bbd9c090/temporary

Request Method:
    POST

Request Payload:
{
    "branch": "feature/empty-ip-fix"
}


Request Headers:
    POST /rest/doc/1.0/documentation/13e022d6cb1442c9ab7c8148bbd9c090/temporary HTTP/1.1
    Host: naatlas-confluence.openstack.local:8090
    Connection: keep-alive
    Content-Length: 33
    Accept: application/json, text/plain, */*
    Origin: http://naatlas-confluence.openstack.local:8090
    X-Requested-With: XMLHttpRequest
    User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36
    Content-Type: application/json;charset=UTF-8
    Referer: http://naatlas-confluence.openstack.local:8090/display/TS/Markup-test
    Accept-Encoding: gzip, deflate
    Accept-Language: pl-PL,pl;q=0.8,en-US;q=0.6,en;q=0.4
    Cookie: JSESSIONID=13F1F830FE60CA13C502A0A3A326293B

Response Status Code:
    200 OK

Response Body:
{
    "id": "3491dea323304f7c8ee9c9346a8c90e3"
}
```