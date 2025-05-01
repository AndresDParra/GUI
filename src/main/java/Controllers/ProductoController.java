package Controllers;

import com.example.correccionparcial.model.Producto;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProductoController {
    public TableView<Producto> TableProductos;
    public TableColumn<String, Producto> ColumnNombre;
    public TableColumn<String, Producto> ColumnPrecio;
    public TableColumn<String, Producto> ColumnComponentes;
    public Label EspacioNombre;
    public Button ButtonAgregarProducto;
    public Button EspacioAgregarComponentes;
    public Button ButtonFiltrarPorComponente;
    public Button ButtonCambiarNombre;
    public Button ButtonCambiarPrecio;
    public Button ButtonOrdenarPorPrecio;
    public Button ButtonContarPorNombre;
    public TextField EspacioNumeroProducto;

    public ProductoController(TableView<Producto> tableProductos, TableColumn<String, Producto> columnNombre, TableColumn<String, Producto> columnPrecio, TableColumn<String, Producto> columnComponentes, Label espacioNombre, Button buttonAgregarProducto, Button espacioAgregarComponentes, Button buttonFiltrarPorComponente, Button buttonCambiarNombre, Button buttonCambiarPrecio, Button buttonOrdenarPorPrecio, Button buttonContarPorNombre, TextField espacioNumeroProducto) {
        TableProductos = tableProductos;
        ColumnNombre = columnNombre;
        ColumnPrecio = columnPrecio;
        ColumnComponentes = columnComponentes;
        EspacioNombre = espacioNombre;
        ButtonAgregarProducto = buttonAgregarProducto;
        EspacioAgregarComponentes = espacioAgregarComponentes;
        ButtonFiltrarPorComponente = buttonFiltrarPorComponente;
        ButtonCambiarNombre = buttonCambiarNombre;
        ButtonCambiarPrecio = buttonCambiarPrecio;
        ButtonOrdenarPorPrecio = buttonOrdenarPorPrecio;
        ButtonContarPorNombre = buttonContarPorNombre;
        EspacioNumeroProducto = espacioNumeroProducto;
    }

    public ProductoController() {
    }

    public TableView<Producto> getTableProductos() {
        return TableProductos;
    }

    public void setTableProductos(TableView<Producto> tableProductos) {
        TableProductos = tableProductos;
    }

    public TableColumn<String, Producto> getColumnNombre() {
        return ColumnNombre;
    }

    public void setColumnNombre(TableColumn<String, Producto> columnNombre) {
        ColumnNombre = columnNombre;
    }

    public TableColumn<String, Producto> getColumnPrecio() {
        return ColumnPrecio;
    }

    public void setColumnPrecio(TableColumn<String, Producto> columnPrecio) {
        ColumnPrecio = columnPrecio;
    }

    public TableColumn<String, Producto> getColumnComponentes() {
        return ColumnComponentes;
    }

    public void setColumnComponentes(TableColumn<String, Producto> columnComponentes) {
        ColumnComponentes = columnComponentes;
    }

    public Label getEspacioNombre() {
        return EspacioNombre;
    }

    public void setEspacioNombre(Label espacioNombre) {
        EspacioNombre = espacioNombre;
    }

    public Button getButtonAgregarProducto() {
        return ButtonAgregarProducto;
    }

    public void setButtonAgregarProducto(Button buttonAgregarProducto) {
        ButtonAgregarProducto = buttonAgregarProducto;
    }

    public Button getEspacioAgregarComponentes() {
        return EspacioAgregarComponentes;
    }

    public void setEspacioAgregarComponentes(Button espacioAgregarComponentes) {
        EspacioAgregarComponentes = espacioAgregarComponentes;
    }

    public Button getButtonFiltrarPorComponente() {
        return ButtonFiltrarPorComponente;
    }

    public void setButtonFiltrarPorComponente(Button buttonFiltrarPorComponente) {
        ButtonFiltrarPorComponente = buttonFiltrarPorComponente;
    }

    public Button getButtonCambiarNombre() {
        return ButtonCambiarNombre;
    }

    public void setButtonCambiarNombre(Button buttonCambiarNombre) {
        ButtonCambiarNombre = buttonCambiarNombre;
    }

    public Button getButtonCambiarPrecio() {
        return ButtonCambiarPrecio;
    }

    public void setButtonCambiarPrecio(Button buttonCambiarPrecio) {
        ButtonCambiarPrecio = buttonCambiarPrecio;
    }

    public Button getButtonOrdenarPorPrecio() {
        return ButtonOrdenarPorPrecio;
    }

    public void setButtonOrdenarPorPrecio(Button buttonOrdenarPorPrecio) {
        ButtonOrdenarPorPrecio = buttonOrdenarPorPrecio;
    }

    public Button getButtonContarPorNombre() {
        return ButtonContarPorNombre;
    }

    public void setButtonContarPorNombre(Button buttonContarPorNombre) {
        ButtonContarPorNombre = buttonContarPorNombre;
    }

    public TextField getEspacioNumeroProducto() {
        return EspacioNumeroProducto;
    }

    public void setEspacioNumeroProducto(TextField espacioNumeroProducto) {
        EspacioNumeroProducto = espacioNumeroProducto;
    }

    public void AgregarProducto(ActionEvent actionEvent) {
    }

    public void AgregarComponente(ActionEvent actionEvent) {
    }

    public void FiltrarPorComponente(ActionEvent actionEvent) {
    }

    public void CambiarNombre(ActionEvent actionEvent) {
    }

    public void CambiarPrecio(ActionEvent actionEvent) {
    }

    public void OrdenarPorPrecio(ActionEvent actionEvent) {
    }

    public void ContarPorPrecio(ActionEvent actionEvent) {
    }
}
