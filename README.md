## Springboot with Apache Kafka

Example project using springboot and kafka

This rest service performs following operations
1. A producer service sends a post object using kafka topic 
2. A consumer service receives the post object from the topic


Running instructions:
To build 
	mvn clean install

Before starting the project make sure you have Apache Kafka installed already and start Zookeeper and Config server

To run the project, navigate to the root of the project and run below command
        mvn spring-boot:run
