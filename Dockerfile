FROM openjdk:17-oracle
COPY kafka-producer-for-creditBroker-0.0.1-SNAPSHOT.jar /kafkaProducer.jar
ENTRYPOINT ["java", "-jar", "kafkaProducer.jar"]