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
