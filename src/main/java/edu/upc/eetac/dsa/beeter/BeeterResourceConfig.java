package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Marti on 16/01/2016.
 */
public class BeeterResourceConfig extends ResourceConfig {

    public BeeterResourceConfig() {
        packages("edu.upc.eetac.dsa.beeter");
    }
}

