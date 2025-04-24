#!/bin/bash
java org.antlr.v4.Tool guitartab.g4
javac *.java
java Driver < $1
