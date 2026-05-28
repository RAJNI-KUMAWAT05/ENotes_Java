FROM tomcat:9.0-jdk17

WORKDIR /app

COPY . .

RUN apt-get update && apt-get install -y maven

RUN mvn clean package

RUN cp target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
