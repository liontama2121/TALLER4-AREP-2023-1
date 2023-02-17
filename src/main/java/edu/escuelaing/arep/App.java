package edu.escuelaing.arep;
import edu.escuelaing.arep.HttpServer.HttpServer;

import java.io.IOException;

public class App {
    public static void main( String[] args ) {
        HttpServer server = new HttpServer();

        try {
            server.start(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
