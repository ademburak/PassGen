# PassGen

To run the application use following command

gradle bootRun

To make the application an executable jar use:

gradle bootJar

Run the application as follows

java -jar PassGen-0.1.0.jar

Use the following command to call the web service

curl http://localhost:8080/doit --data "pass=11111111&key=222222"
