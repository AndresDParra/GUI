package Controllers;

import java.net.URL;

public class debugResourceLoading {
    static void debugResourceLoadingg() {
        // Try various potential locations
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        System.out.println("Attempting to find Login.fxml:");

        URL[] attempts = {
                Main.class.getResource("Login.fxml"),
                Main.class.getResource("/Login.fxml"),
                Main.class.getResource("/Controllers/Login.fxml"),
                Main.class.getResource("/PaginaSeleccionProductoODispositivo.fxml"),
                ClassLoader.getSystemResource("Login.fxml"),
                ClassLoader.getSystemResource("Controllers/Login.fxml"),
                ClassLoader.getSystemResource("PaginaSeleccionProductoODispositivo.fxml"),
        };

        String[] paths = {
                "Main.class.getResource(\"Login.fxml\")",
                "Main.class.getResource(\"/Login.fxml\")",
                "Main.class.getResource(\"/Controllers/Login.fxml\")",
                "Main.class.getResource(\"/PaginaSeleccionProductoODispositivo.fxml\")",
                "ClassLoader.getSystemResource(\"Login.fxml\")",
                "ClassLoader.getSystemResource(\"Controllers/Login.fxml\")",
                "ClassLoader.getSystemResource(\"PaginaSeleccionProductoODispositivo.fxml\")",

        };

        for (int i = 0; i < attempts.length; i++) {
            System.out.println(paths[i] + " = " + attempts[i]);
        }
    }
}
