package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public Button ButtonLogin;

    public LoginController(Button buttonLogin) {
        ButtonLogin = buttonLogin;
    }
    public LoginController() {

    }



    public Button getButtonLogin() {
        return ButtonLogin;
    }

    public void setButtonLogin(Button buttonLogin) {
        ButtonLogin = buttonLogin;
    }

    public void CargarMenu(ActionEvent actionEvent) throws IOException {
         FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("PaginaSeleccionProductoODispositivo.fxml"));
         Parent root = loader.load();
         Stage stage = (Stage) ButtonLogin.getScene().getWindow();
         stage.setScene(new Scene(root));
         stage.show();
    }
}
