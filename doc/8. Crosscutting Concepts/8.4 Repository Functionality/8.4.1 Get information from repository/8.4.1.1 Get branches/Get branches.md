### Get branches

Endpoint for getting a branch list from repository is available at:

```
POST {git4c-backend-url}/repository/branches
```

#### Example request and response
```
Request URL:
    http://pc-kurban:1990/confluence/rest/doc/1.0/documentation/repository/branches

Request Method:
    POST

Request Payload:
{
    "sourceRepositoryUrl": "https://kurban@bitbucket.networkedassets.net/bitbucket/scm/condoc/markup.git",
    "credentials":
    {
        "type": "USERNAMEPASSWORD",
        "username": "kurban",
        "password": "mySuperSecretPassword1a4"
    }
}


Request Headers:
    POST /confluence/rest/doc/1.0/documentation/repository/branches HTTP/1.1
    Host: pc-kurban:1990
    Connection: keep-alive
    Content-Length: 195
    Accept: application/json, text/plain, */*
    Origin: http://pc-kurban:1990
    X-Requested-With: XMLHttpRequest
    User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36
    Content-Type: application/json;charset=UTF-8
    Referer: http://pc-kurban:1990/confluence/pages/createpage.action?spaceKey=ds
    Accept-Encoding: gzip, deflate
    Accept-Language: pl-PL,pl;q=0.8,en-US;q=0.6,en;q=0.4
    Cookie: JSESSIONID=AE443C4BAB5989773D070B4AAB512FF7; confluence.browse.space.cookie=space-templates

Response Status Code:
    200 OK

Response Body:
{
    "currentBranch":null,
    "allBranches":
    [
        "NAATLAS-962-Active-Objects",
        "bugfix/dbfix",
        "bugfix/resturl_branches",
        "develop",
        "feature/#923",
        "feature/NAATLAS-1000-1020"
    ]
}
```

### Existing Repository


You can also refer the existing repository directly by its uuid.

Endpoint for getting the list of branches is available at:
```
GET {git4c-backend-url}/repository/{uuid}/branches
```