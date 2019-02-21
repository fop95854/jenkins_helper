@echo off
javac Jenkins_RCE.java
jar -cvf Jenkins_RCE-%1.jar META-INF Jenkins_RCE.class
mkdir package
mkdir package\Jenkins_RCE
mkdir package\Jenkins_RCE\%1
move Jenkins_RCE-%1.jar package\Jenkins_RCE\%1