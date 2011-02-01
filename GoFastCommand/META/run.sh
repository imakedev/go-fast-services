#!/bin/sh
CLASS_PATH=.:lib/jcommon-1.0.16.jar:lib/joda-time-1.6.jar:lib/poi-3.6-20091214.jar:lib/mysql-connector-java-5.1.14-bin.jar:lib/gofastcommand.jar
#java -jar gofastcommand.jar $1
#java -classpath $CLASS_PATH com.moogle.gofast.command.Test $1
java -classpath $CLASS_PATH com.moogle.gofast.command.MAIN $1
