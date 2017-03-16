rem call mvn clean package -Dmaven.test.skip=true
call mvn exec:java -Dstart-class=hello.QueryTester -Dmaven.test.skip=true
