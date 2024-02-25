# SpringBoot-Kafka

# Step-1:
Open a terminal to start zookeper service for kafka :
# ./bin/windows/zookeeper-server-start.bat ./config/zookeeper.properties
# Step-2:
Open a terminal to create a new kafka topic using the following commands : 
# ./bin/windows/kafka-topics.bat --create --topic orderTopic --bootstrap-server localhost:9092
# ./bin/windows/kafka-topics.bat --describe --topic orderTopic --bootstrap-server localhost:9092

# Step-3:
Open another terminal to start a kafka server: 
# ./bin/windows/kafka-server-start.bat ./config/server.properties 

# Step-4:
Now send data using POSTMAN to localhost : http://localhost:8181/ 
And in RAW pass -> order1 , order2 ,etc
