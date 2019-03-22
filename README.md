# prometheuss-setup

This is basic micrometer setup with java. 

## How to run
```
git clone git@github.com:divya2661/prometheuss-setup.git
cd prometheuss-setup
$ ./gradlew fatJar
$ java -jar ./build/lib/all-in-one-jar-1.0-SNAPSHOT.jar

Go to  http://localhost:8080/hello, if it is working fine.
```


Once this is done go to `http://localhost:8080/metrics` to see the data
the `test_counter_total` will increase whenever you refresh `http://localhost:8080/hello`

Now you have the basic java application up and running with micrometer integration.
You can give the `metrics` url to prometheus.

