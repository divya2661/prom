import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.Counter;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.HTTPServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Prometheus {

    private static Prometheus INSTANCE;
    private static PrometheusMeterRegistry prometheusMeterRegistry;

    private Prometheus(int port) {
        try {
            CollectorRegistry registry = CollectorRegistry.defaultRegistry;
            new HTTPServer(new InetSocketAddress(port), registry);
            prometheusMeterRegistry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT, registry, Clock.SYSTEM);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void init(int port) {
        if (INSTANCE == null) {
            INSTANCE = new Prometheus(port);
        }
    }

    public static Counter getCounter(String name) {
        return prometheusMeterRegistry.counter(name);
    }

}
