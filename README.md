Steps to run

1.add the plugin
<plugin>
<groupId>com.google.cloud.tools</groupId>
<artifactId>jib-maven-plugin</artifactId>
<version>2.6.0</version>
<configuration>
<to>
<image>registry.hub.docker.com/kctiraj44/google-jib-image-example</image>
</to>
</configuration>
</plugin>

2. mvn clean compile jib:build

3. docker run -p 8080:8080 kctiraj44/google-jib-image-example

4. In setting.xml add dockerhub username and password
<server>
      <id>registry.hub.docker.com</id>
      <username>kctiraj44</username>
      <password>M</password>
    </server>
