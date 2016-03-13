export JAVA_OPTS="$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Xss4m -Xmx512m -Xms512m -XX:PermSize=256m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true"
./gradlew phg-rest:tomcatRun -s
