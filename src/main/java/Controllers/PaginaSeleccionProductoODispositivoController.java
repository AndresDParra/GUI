package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaSeleccionProductoODispositivoController {

    public Button ButtonProductos;
    public Button ButtonDispositivos;

    public PaginaSeleccionProductoODispositivoController(Button buttonProductos, Button buttonDispositivos) {
        ButtonProductos = buttonProductos;
        ButtonDispositivos = buttonDispositivos;
    }
    public PaginaSeleccionProductoODispositivoController() {
    }

    public Button getButtonProductos() {
        return ButtonProductos;
    }

    public void setButtonProductos(Button buttonProductos) {
        ButtonProductos = buttonProductos;
    }

    public Button getButtonDispositivos() {
        return ButtonDispositivos;
    }

    public void setButtonDispositivos(Button buttonDispositivos) {
        ButtonDispositivos = buttonDispositivos;
    }

    public void CargarPaginaProductos(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("Producto.fxml"));
        Parent root = loader.load();
        ProductoController controller = loader.getController();
        Stage stage = (Stage) ButtonProductos.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

        controller.inicializartablasProductos();
    }

    public void CargarPaginaDispositivos(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("Dispositivo.fxml"));
        Parent root = loader.load();
        DispositivoController controller = loader.getController();
        Stage stage = (Stage) ButtonDispositivos.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();



        controller.initialize();

    }
}