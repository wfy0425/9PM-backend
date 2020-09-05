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
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


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
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Tags

* 鉴权


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


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
|**Path**|**id**  <br>*required*|用户Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


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
|**Path**|**id**  <br>*required*|用户Id|integer (int32)||
|**Query**|**name**  <br>*optional*|姓名|string||
|**Query**|**password**  <br>*optional*|密码|string||
|**Query**|**sex**  <br>*optional*|性别|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


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
|**Path**|**teamId**  <br>*required*|队伍Id|integer (int32)|
|**Path**|**userId**  <br>*required*|用户Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="removeuserfromjoinedteamusingdelete"></a>
### 从队伍中删除用户
```
DELETE /users/{teamId}.{userId}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**teamId**  <br>*required*|队伍Id|integer (int32)|
|**Path**|**userId**  <br>*required*|用户Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Tags

* 用户管理


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|
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


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


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
|**Path**|**id**  <br>*required*|房主Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


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
|**Path**|**id**  <br>*required*|队伍Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


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
|**Path**|**id**  <br>*required*|队伍Id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseBean](#responsebean)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="getuserlistusingget"></a>

## Authors

* **Fengyuan Wu** - *Author* - [wfy0425](https://github.com/wfy0425)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

《深入浅出Spring Boot 2.x》 （杨开振）