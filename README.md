# serenitysample

To run the test

mvn clean verify -P int -P local

To run with tags
mvn clean verify -P int -P local -Dcucumber.options="--tags @Sample1"
