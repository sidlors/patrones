@echo off
javac src\com\sidlors\abstracfactory\*.java -d class
cd class
jar -cvfm AbstractFactoryexample.jar MANIFEST.txt  com\sidlors\abstracfactory\*.class
