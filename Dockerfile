FROM openjdk
WORKDIR /app
COPY . /app
COPY mysql-connector-java-8.0.15.jar /app/lib/
#ENV CLASSPATH=lib/mysql-connector-java-8.0.15.jar:${CLASSPATH}
RUN javac *.java
CMD ["java", "-cp", "/app/lib/mysql-connector-java-8.0.15.jar:.","Select"]
