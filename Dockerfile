FROM openjdk:8

ADD target/template.jar .

CMD java -jar template.jar --spring.profiles.active=docker