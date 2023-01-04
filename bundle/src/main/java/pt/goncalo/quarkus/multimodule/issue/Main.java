package pt.goncalo.quarkus.multimodule.issue;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {


    public static void main(String[] args) {
        String runMode = System.getenv("RUN_MODE");
        Quarkus.run(args);
    }
}
