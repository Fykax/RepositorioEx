@CHCP 65001 > NUL
@ECHO OFF

SET OLDPATH=%PATH%
SET PATH=c:\java\jdk11\bin;%PATH%
SET CLASSPATH=bin
SET JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8

java -jar CrearBD.jar

ECHO.

PAUSE
SET PATH=%OLDPATH%