SET JAVA_HOME=jdk1.7
SET Path=jdk1.7\bin;%Path%

SET CP=fitlibrary-2.0.jar
SET java.class.path=%CP%


java -cp %CP% -jar fitnesse-standalone.jar -o
pause
