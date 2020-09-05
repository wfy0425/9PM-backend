
<a name="paths"></a>
## Paths

<a name="unauthorizedusingpost"></a>
### unauthorized
```
POST /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**201**|Created|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusingget"></a>
### unauthorized
```
GET /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusingput"></a>
### unauthorized
```
PUT /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**201**|Created|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusingdelete"></a>
### unauthorized
```
DELETE /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**204**|No Content|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusingpatch"></a>
### unauthorized
```
PATCH /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**204**|No Content|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusinghead"></a>
### unauthorized
```
HEAD /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**204**|No Content|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="unauthorizedusingoptions"></a>
### unauthorized
```
OPTIONS /401
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**204**|No Content|No Content|
|**401**|Unauthorized|[ResponseBean](#responsebean)|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="loginusingget"></a>
### login
```
GET /login
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**email**  <br>*required*|email|string|
|**Query**|**password**  <br>*required*|password|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="registerusingpost"></a>
### register
```
POST /register
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**email**  <br>*required*|email|string||
|**Query**|**name**  <br>*required*|name|string||
|**Query**|**password**  <br>*required*|password|string||
|**Query**|**sex**  <br>*optional*|sex|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="requireauthusingget"></a>
### requireAuth
```
GET /require_auth
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="requirepermissionusingget"></a>
### requirePermission
```
GET /require_permission
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="requireroleusingget"></a>
### requireRole
```
GET /require_role
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="createroomusingpost"></a>
### 创建队伍
```
POST /rooms
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**date**  <br>*required*|date|string|
|**Query**|**gameName**  <br>*required*|gameName|string|
|**Query**|**hostId**  <br>*required*|hostId|integer (int32)|
|**Query**|**maxNumber**  <br>*required*|maxNumber|integer (int32)|
|**Query**|**time**  <br>*required*|time|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 队伍管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getroomlistusingget"></a>
### 获取房间列表
```
GET /rooms
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 队伍管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getroominfobyhostidusingget"></a>
### 通过房主id获取队伍信息
```
GET /rooms/host/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 队伍管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getroominfobyroomidusingget"></a>
### 通过队伍id获取队伍信息
```
GET /rooms/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 队伍管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="deleteroombyroomidusingdelete"></a>
### 通过队伍id删除队伍
```
DELETE /rooms/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `\*/*`


#### Tags

* 队伍管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserlistusingget"></a>
### 获取用户列表
```
GET /users
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserinfobyuseridusingget"></a>
### 通过用户id获取用户信息
```
GET /users/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `\*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="updateuserusingput"></a>
### 更新用户详细信息
```
PUT /users/{id}
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)||
|**Query**|**name**  <br>*optional*|name|string||
|**Query**|**password**  <br>*optional*|password|string||
|**Query**|**sex**  <br>*optional*|sex|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="jointeamusingput"></a>
### 将用户加入队伍
```
PUT /users/{teamId}.{userId}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**teamId**  <br>*required*|teamId|integer (int32)|
|**Path**|**userId**  <br>*required*|userId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `\*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="removeuserfromjoinedteamusingdelete"></a>
### 从组队中删除用户
```
DELETE /users/{teamId}.{userId}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**teamId**  <br>*required*|teamId|integer (int32)|
|**Path**|**userId**  <br>*required*|userId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `\*/*`


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|



