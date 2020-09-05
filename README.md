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

## API
TODO
### Login
Login by *Get* method though *http://localhost:8080/login/course/{email}.{password}* 

### signup
signup by *POST* method though *http://localhost:8080/namelesscape/course/{email}.{password}* 

```
http://localhost:8080/namelesscape/instructor/Smith, Jhon
```

A JSON file will be returned if the query success. 

### Get Course Information By Term
Get course information by *GET* method though */namelesscape/term/TERM* 
```
http://localhost:8080/namelesscape/term/FA19
```

A JSON file will be returned if the query success. 


## Authors

* **Fengyuan Wu** - *Author* - [wfy0425](https://github.com/wfy0425)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

《深入浅出Spring Boot 2.x》 （杨开振）