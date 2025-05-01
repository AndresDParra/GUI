package Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

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

    public void CargarPaginaProductos(ActionEvent actionEvent) {
    }

    public void CargarPaginaDispositivos(ActionEvent actionEvent) {
    }
}
