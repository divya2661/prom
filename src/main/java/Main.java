import io.micrometer.core.instrument.Counter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Prometheus.init(8090);
        Counter counter = Prometheus.getCounter("test_counter");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("okay");
    }
}
