# 9PM Online Teaming Platform -backend

## About The Project

[9PM Online Teaming Platform——Fronted](https://github.com/YueqianMa/Unicode_Hackathon)

This project is the backend of the 9PM Online Teaming Platform for Unicode Hackathon. 9PM Online Teaming Platform aims to facilitate game teaming for international students from China in this self-quarantine period and further. 

### Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://spring.io/projects/spring-boot) - Server Framework
* [Shiro](http://shiro.apache.org/) - Security Framework 
* [MyBatis](https://mybatis.org/) - Persistence Framework
* [MyBatis-plus](https://baomidou.com/) - MyBatis plus plus
* [MySQL](https://www.mysql.com/) - Database
* [fastjson](https://github.com/alibaba/fastjson) - Parse JSON Object

## Quick Start

### Prerequisites

* MySQL

Installation guide:
```
https://www.runoob.com/mysql/mysql-install.html
```

Establish develop environment data

```
Some SQL 
```

### Installation

1. Clone the repo
```sh
https://github.com/wfy0425/Unicode-Hackathon-backend.git
```

2. Package the Application 

3. Run it



<a name="APIs"></a>
## APIs
### 登陆
```
GET /login
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**email**  <br>*required*|登录邮箱|string|
|**Query**|**password**  <br>*required*|登录密码|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|ResponseBean|
|**400**|Unauthorized|ResponseBean|

```json
{
    "code": 200,
    "msg": "Login success",
    "data": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1OTkzMDk5NzgsInVzZXJuYW1lIjoiMTIzQGdtYWlsLmNvbSJ9.0i4g4K5IcOY5h2q9xYuYtG_sbkjkc5LwEilz9KM_YvQ"
}
```
```json
{
    "code": 400,
    "msg": "username or password wrong",
    "data": null
}
```
<a name="registerusingpost"></a>
### 注册
```
POST /register
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**email**  <br>*required*|用户邮箱|string||
|**Query**|**name**  <br>*required*|姓名|string||
|**Query**|**password**  <br>*required*|密码|string||
|**Query**|**sex**  <br>*optional*|性别|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**201**|Created|ResponseBean|
|**400**|Unauthorized|ResponseBean|
```json
{
    "code": 201,
    "msg": "user registered",
    "data": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1OTkzMTM0ODUsInVzZXJuYW1lIjoiYWJjQHVjc2QuZWR1In0.RrPSAM0iJi7GFAMMTgLbLZHPwjPdglmF5cHrWSTV3ug"
}
```
```json
{
    "code": 400,
    "msg": "username already exist",
    "data": null
}
```
<a name="requireauthusingget"></a>
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


<a name="getuserinfobyuseridusingget"></a>
### 通过用户id获取用户信息
```
GET /users/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|用户Id|integer (int32)|
|**Header**|**Authorization**  <br>*required*|token|string|

#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK||
|**401**|Unauthorized|ResponseBean|


```json
{
    "code": 200,
    "msg": "OK",
    "data": [
        {
            "id": 1,
            "email": "123@gmail.com",
            "password": "123",
            "name": "Adam",
            "myTeams": "1",
            "joinedTeams": "2",
            "sex": 1,
            "roles": null
        },
        ...
    ]
}
```
```json
{
    "code": 401,
    "msg": "The current Subject is not authenticated.  Access denied.",
    "data": null
}
```
<a name="updateuserusingput"></a>
### 更新用户详细信息
```
PUT /users/{id}
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Path**|**id**  <br>*required*|用户Id|integer (int32)||
|**Query**|**name**  <br>*optional*|姓名|string||
|**Query**|**password**  <br>*optional*|密码|string||
|**Query**|**sex**  <br>*optional*|性别|integer (int32)|`0`|
|**Header**|**Authorization**  <br>*required*|token|string|

#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|ResponseBean|
|**401**|Unauthorized|ResponseBean|

```json
{
    "code": 200,
    "msg": "OK",
    "data": {
        "id": 17,
        "email": null,
        "password": null,
        "name": "Yukinoshita Yukino",
        "myTeams": null,
        "joinedTeams": null,
        "sex": 0,
        "roles": null
    }
}
```

```json
{
    "code": 401,
    "msg": "The current Subject is not authenticated.  Access denied.",
    "data": null
}
```

<a name="jointeamusingput"></a>
### 将用户加入队伍
```
PUT /users/{teamId}/{userId}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**teamId**  <br>*required*|队伍Id|integer (int32)|
|**Path**|**userId**  <br>*required*|用户Id|integer (int32)|
|**Header**|**Authorization**  <br>*required*|token|string|

#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|ResponseBean|
|**401**|Unauthorized|ResponseBean|

```json
{
    "code": 200,
    "msg": "OK",
    "data": 1
}
```
```json
{
    "code": 401,
    "msg": "Unauthorized",
    "data": null
}
```

<a name="removeuserfromjoinedteamusingdelete"></a>
### 从队伍中删除用户
```
DELETE /users/{teamId}/{userId}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**teamId**  <br>*required*|队伍Id|integer (int32)|
|**Path**|**userId**  <br>*required*|用户Id|integer (int32)|
|**Header**|**Authorization**  <br>*required*|token|string|

#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|ResponseBean|
|**401**|Unauthorized|ResponseBean|
```json
{
    "code": 200,
    "msg": "OK",
    "data": 1
}
```
```json
{
    "code": 401,
    "msg": "Unauthorized",
    "data": null
}
```

### 创建队伍
```
POST /rooms
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**gameName**  <br>*required*|游戏名字|string|
|**Query**|**hostId**  <br>*required*|房主Id|integer (int32)|
|**Query**|**maxNumber**  <br>*required*|队伍最大人数|integer (int32)|
|**Query**|**date**  <br>*required*|游戏日期|string|
|**Query**|**time**  <br>*required*|游戏时间|string|
|**Header**|**Authorization**  <br>*required*|token|string|

#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|ResponseBean|
|**401**|Unauthorized|ResponseBean|
```json
{
    "code": 201,
    "msg": "CREATED",
    "data": {
        "id": 8,
        "dateTime": "2222",
        "gameName": "123",
        "maxNumber": 4,
        "hostId": 17,
        "membersId": null
    }
}
```
```json
{
    "code": 401,
    "msg": "Unauthorized",
    "data": null
}
```
<a name="getroomlistusingget"></a>
### 获取队伍列表
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


<a name="getroominfobyhostidusingget"></a>
### 通过房主id获取队伍信息
```
GET /rooms/host/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|房主Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


<a name="getroominfobyroomidusingget"></a>
### 通过队伍id获取队伍信息
```
GET /rooms/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|队伍Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


<a name="deleteroombyroomidusingdelete"></a>
### 通过队伍id删除队伍
```
DELETE /rooms/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|队伍Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


<a name="getuserlistusingget"></a>

## Authors

* **Fengyuan Wu** - *Author* - [wfy0425](https://github.com/wfy0425)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

《深入浅出Spring Boot 2.x》 （杨开振）

[Shiro + JWT + Spring Boot Restful 简易教程](https://github.com/Smith-Cruise/Spring-Boot-Shiro)

[使用Swagger2Markup实现API文档的静态部署](http://blog.didispace.com/swagger2markup-asciidoc/)