#!/usr/bin/env bash

mvn clean install
java -cp target/OUTPUT.jar org.rock.paper.scissors.Main