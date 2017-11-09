
### Get branches

Endpoint for getting a branch list from predefined repository is available at:

```
GET {git4c-backend-url}/predefine/{uuid}/branches
```


#### Example request and response
```
Request URL:
    http://pc-kurban:1990/confluence/rest/doc/1.0/documentation/predefine/e48d4c85c7ce470d91500b2f7ce1b2b9/branches

Request Method:
    GET


Request Headers:
    GET /confluence/rest/doc/1.0/documentation/predefine/e48d4c85c7ce470d91500b2f7ce1b2b9/branches HTTP/1.1
    Host: pc-kurban:1990
    Connection: keep-alive
    Accept: application/json, text/plain, */*
    X-Requested-With: XMLHttpRequest
    User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36
    Referer: http://pc-kurban:1990/confluence/pages/createpage.action?spaceKey=ds
    Accept-Encoding: gzip, deflate
    Accept-Language: pl-PL,pl;q=0.8,en-US;q=0.6,en;q=0.4
    Cookie: JSESSIONID=AE443C4BAB5989773D070B4AAB512FF7; confluence.browse.space.cookie=space-templates

Response Status Code:
    200 OK

Response Body:
{
    "currentBranch":"",
    "allBranches":
    [
        "feature/NAATLAS-first-use-case",
        "feature/fix_tests",
        "feature/remove_failing_tests",
        "feature/NAATLAS-1261-when-clicking-on-the-link-to",
        "feature/NAATLAS-removed-url-parse",
        "bugfix/NAATLAS-1213-typos-in-texts-of-plugin",
        "feature/NAATLAS-1001-refresh-at-backend",
        "release/1.0",
        "feature/NAATLAS-1048-br-tags-are-lost-during-conversion",
        "feature/NAATLAS-980-remove-padding",
        "feature/NAATLAS-1190-fix-glob-names",
        "feature/NAATLAS-1288-background-color",
        "feature/NAATLAS-1181-administrator-should-be-able",
        "feature/ci_testing"
    ]
}

```