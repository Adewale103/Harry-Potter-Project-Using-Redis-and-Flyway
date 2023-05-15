# Harry-Potter-Project-Using-Redis-and-Flyway
**Technologies used**
Flyway
Redis
Open-API(Swagger)
Lombok
Java-17
Spring-boot
MySQL


**Setup Locally Without Docker**
Install Java 17
Install Maven
Install MySQL
Install Redis

**Start the redis server and specify the port in application.properties file**

sudo redis-server path-to/redis.conf

**Run the below commands in the core**

mvn clean
mvn install

**Execute any of the two commands below to run the application**

java -jar target/redis-caching-spring-boot-0.0.1-SNAPSHOT.jar
mvn spring-boot:run
The Default port is 8080 

To view Swagger-UI (API-docs)

http://localhost:8080/swagger-ui.html
