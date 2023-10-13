package org.acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 */
@QuarkusMain
public class MainApp {
    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String... args) {
        log.info("QuarkusMain main method");
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            log.info("QuarkusApplication run method");
            Quarkus.waitForExit();
            return 0;
        }
    }
}
