package Controllers;

import com.example.correccionparcial.model.RegistroGlobal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static Controllers.debugResourceLoading.debugResourceLoadingg;

public class  Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        debugResourceLoadingg();
        RegistroGlobal.inicializarClases();
        FXMLLoader fxmlLoader = new FXMLLoader(ClassLoader.getSystemResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 400);
        stage.setTitle("Welcome to FentaLibre!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}