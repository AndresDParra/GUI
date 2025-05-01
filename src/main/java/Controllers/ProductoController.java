package Controllers;

import com.example.correccionparcial.model.Producto;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Comparator;

public class ProductoController {
    public TableView<Producto> TableProductos;
    public TableColumn<Producto,String > ColumnNombre;
    public TableColumn<Producto,String > ColumnPrecio;
    public TableColumn<Producto,String > ColumnComponentes;
    public TextField EspacioNombre;
    public Button ButtonAgregarProducto;
    public Button EspacioAgregarComponentes;
    public Button ButtonFiltrarPorComponente;
    public Button ButtonCambiarPrecio;
    public Button ButtonOrdenarPorPrecio;
    public Button ButtonContarPorNombre;
    public TextField EspacioNumeroProducto;
    public TextField EspacioComponente;
    public TextField EspacioPrecio;
    public Button ButtonRegresar;

    public ProductoController(TableView<Producto> tableProductos, TableColumn<Producto,String > columnNombre, TableColumn<Producto,String > columnPrecio, TableColumn<Producto,String > columnComponentes, TextField espacioNombre, Button buttonAgregarProducto, Button espacioAgregarComponentes, Button buttonFiltrarPorComponente, Button buttonCambiarPrecio, Button buttonOrdenarPorPrecio, Button buttonContarPorNombre, TextField espacioNumeroProducto, TextField espacioComponente, TextField espacioPrecio, Button buttonRegresar) {
        TableProductos = tableProductos;
        ColumnNombre = columnNombre;
        ColumnPrecio = columnPrecio;
        ColumnComponentes = columnComponentes;
        EspacioNombre = espacioNombre;
        ButtonAgregarProducto = buttonAgregarProducto;
        EspacioAgregarComponentes = espacioAgregarComponentes;
        ButtonFiltrarPorComponente = buttonFiltrarPorComponente;
        ButtonCambiarPrecio = buttonCambiarPrecio;
        ButtonOrdenarPorPrecio = buttonOrdenarPorPrecio;
        ButtonContarPorNombre = buttonContarPorNombre;
        EspacioNumeroProducto = espacioNumeroProducto;
        EspacioComponente = espacioComponente;
        EspacioPrecio = espacioPrecio;
        ButtonRegresar = buttonRegresar;
    }

    public ProductoController() {
    }

    public TableView<Producto > getTableProductos() {
        return TableProductos;
    }

    public void setTableProductos(TableView<Producto> tableProductos) {
        TableProductos = tableProductos;
    }

    public TableColumn<Producto,String > getColumnNombre() {
        return ColumnNombre;
    }

    public void setColumnNombre(TableColumn<Producto,String > columnNombre) {
        ColumnNombre = columnNombre;
    }

    public TableColumn<Producto,String > getColumnPrecio() {
        return ColumnPrecio;
    }

    public void setColumnPrecio(TableColumn<Producto,String > columnPrecio) {
        ColumnPrecio = columnPrecio;
    }

    public TableColumn<Producto,String > getColumnComponentes() {
        return ColumnComponentes;
    }

    public void setColumnComponentes(TableColumn<Producto,String > columnComponentes) {
        ColumnComponentes = columnComponentes;
    }

    public TextField getEspacioNombre() {
        return EspacioNombre;
    }

    public void setEspacioNombre(TextField espacioNombre) {
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

    public TextField getEspacioComponente() {
        return EspacioComponente;
    }

    public void setEspacioComponente(TextField espacioComponente) {
        EspacioComponente = espacioComponente;
    }

    public TextField getEspacioPrecio() {
        return EspacioPrecio;
    }

    public void setEspacioPrecio(TextField espacioPrecio) {
        EspacioPrecio = espacioPrecio;
    }

    public Button getButtonRegresar() {
        return ButtonRegresar;
    }

    public void setButtonRegresar(Button buttonRegresar) {
        ButtonRegresar = buttonRegresar;
    }

    public void AgregarProducto(ActionEvent actionEvent) {
        String nombre = EspacioNombre.getText();
        String precio = EspacioPrecio.getText();
        String componentes = EspacioComponente.getText();
        Producto producto = new Producto.Builder().setNombre(nombre).setPrecio(Double.parseDouble(precio)).addComponente(componentes).build();
        TableProductos.getItems().add(producto);
        EspacioNombre.clear();
        EspacioPrecio.clear();
        EspacioComponente.clear();
    }

    public void AgregarComponente(ActionEvent actionEvent) {
        int index = Integer.parseInt(EspacioNumeroProducto.getText());
        String componente = EspacioComponente.getText();
        Producto producto = TableProductos.getItems().get(index);
        new Producto.Builder().addComponente(componente).build();
        TableProductos.refresh();
        EspacioNumeroProducto.clear();
        EspacioComponente.clear();
    }

    public void FiltrarPorComponente(ActionEvent actionEvent) {
        String componente = EspacioComponente.getText();
        TableView<Producto> productosFiltrados = new TableView<>();
        for (Producto producto : TableProductos.getItems()) {
            if (producto.contiene(componente)) {
                productosFiltrados.getItems().add(producto);
            }
        }
        TableProductos.setItems(productosFiltrados.getItems());
        EspacioComponente.clear();
    }



    public void CambiarPrecio(ActionEvent actionEvent) {
        int index = Integer.parseInt(EspacioNumeroProducto.getText());
        String precio = EspacioPrecio.getText();
        Producto producto = TableProductos.getItems().get(index);
        producto.setPrecio(Double.parseDouble(precio));
        TableProductos.refresh();
        EspacioNumeroProducto.clear();
        EspacioPrecio.clear();
    }

    public void OrdenarPorPrecio(ActionEvent actionEvent) {
        TableProductos.getItems().sort(Comparator.comparingDouble(Producto::getPrecio));
        TableProductos.refresh();
    }

    public void ContarPorPrecio(ActionEvent actionEvent) {
        String precio = EspacioPrecio.getText();
        int contador = 0;
        for (Producto producto : TableProductos.getItems()) {
            if (producto.getPrecio() - Double.parseDouble(precio) == 0) {
                contador++;
            }
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Conteo de Productos");
        alert.setHeaderText(null);
        alert.setContentText("Cantidad de productos con el precio " + precio + ": " + contador);
        alert.showAndWait();
        EspacioComponente.clear();
    }

    public void Regresar(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("PaginaSeleccionProductoODispositivo.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ButtonRegresar.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void inicializartablasProductos() {
        TableProductos = new TableView<>();
        ColumnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        ColumnPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getPrecio())));
        ColumnComponentes.setCellValueFactory(cellData -> new SimpleStringProperty(String.join(", ", cellData.getValue().getComponentes())));
    }
}
