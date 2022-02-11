FROM java
COPY . /var/www/java  
WORKDIR /var/www/java
RUN javac Welcome.java
CMD ["java","Welcome"]