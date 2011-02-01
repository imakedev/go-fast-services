@echo off

set classpath=.;lib/jcommon-1.0.16.jar;lib/joda-time-1.6.jar;lib/poi-3.6-20091214.jar;lib/mysql-connector-java-5.1.14-bin.jar;lib/gofastcommand.jar

REM java -classpath %classpath% com.moogle.gofast.command.Test %1
java -classpath %classpath% com.moogle.gofast.command.MAIN %1 

