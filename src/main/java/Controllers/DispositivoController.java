package Controllers;

import com.example.correccionparcial.model.DispositivoSimple;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class DispositivoController {
    public TableView<DispositivoSimple> TableProductos;
    public TableColumn<DispositivoSimple, String> clmEstado;
    public TableColumn<DispositivoSimple, String> clmPrioridad;
    public TableColumn<DispositivoSimple, String> clmTipo;
    public Label lblNombre;
    public Label lblEstado;
    public Label lblPrioridad;
    public Button BtnAgregarDispositivo;
    public Button BtnAgregarModulo;
    public Button BtnFiltrarConModulos;
    public Button BtnOrdenarPorPrioridad;
    public Button BtnContarPorTipo;
    public TextField lblContadorPorTipo;
    public Label lblTipo;
    public Label lblModulo;
    public TextField txfContadorPorTipo;
    public Button ButtonRegresar;

    public DispositivoController(TableView<DispositivoSimple> tableProductos, TableColumn<DispositivoSimple, String> clmEstado, TableColumn<DispositivoSimple, String> clmPrioridad, TableColumn<DispositivoSimple, String> clmTipo, Label lblNombre, Label lblEstado, Label lblPrioridad, Button btnAgregarDispositivo, Button btnAgregarModulo, Button btnFiltrarConModulos, Button btnOrdenarPorPrioridad, Button btnContarPorTipo, TextField lblContadorPorTipo, Label lblTipo, Label lblModulo, TextField txfContadorPorTipo, Button buttonRegresar) {
        TableProductos = tableProductos;
        this.clmEstado = clmEstado;
        this.clmPrioridad = clmPrioridad;
        this.clmTipo = clmTipo;
        this.lblNombre = lblNombre;
        this.lblEstado = lblEstado;
        this.lblPrioridad = lblPrioridad;
        BtnAgregarDispositivo = btnAgregarDispositivo;
        BtnAgregarModulo = btnAgregarModulo;
        BtnFiltrarConModulos = btnFiltrarConModulos;
        BtnOrdenarPorPrioridad = btnOrdenarPorPrioridad;
        BtnContarPorTipo = btnContarPorTipo;
        this.lblContadorPorTipo = lblContadorPorTipo;
        this.lblTipo = lblTipo;
        this.lblModulo = lblModulo;
        this.txfContadorPorTipo = txfContadorPorTipo;
        ButtonRegresar = buttonRegresar;
    }

    public DispositivoController() {
    }

    public TableView<DispositivoSimple> getTableProductos() {
        return TableProductos;
    }

    public void setTableProductos(TableView<DispositivoSimple> tableProductos) {
        TableProductos = tableProductos;
    }

    public TableColumn<DispositivoSimple, String> getClmEstado() {
        return clmEstado;
    }

    public void setClmEstado(TableColumn<DispositivoSimple, String> clmEstado) {
        this.clmEstado = clmEstado;
    }

    public TableColumn<DispositivoSimple, String> getClmPrioridad() {
        return clmPrioridad;
    }

    public void setClmPrioridad(TableColumn<DispositivoSimple, String> clmPrioridad) {
        this.clmPrioridad = clmPrioridad;
    }

    public TableColumn<DispositivoSimple, String> getClmTipo() {
        return clmTipo;
    }

    public void setClmTipo(TableColumn<DispositivoSimple, String> clmTipo) {
        this.clmTipo = clmTipo;
    }

    public Label getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(Label lblNombre) {
        this.lblNombre = lblNombre;
    }

    public Label getLblEstado() {
        return lblEstado;
    }

    public void setLblEstado(Label lblEstado) {
        this.lblEstado = lblEstado;
    }

    public Label getLblPrioridad() {
        return lblPrioridad;
    }

    public void setLblPrioridad(Label lblPrioridad) {
        this.lblPrioridad = lblPrioridad;
    }

    public Button getBtnAgregarDispositivo() {
        return BtnAgregarDispositivo;
    }

    public void setBtnAgregarDispositivo(Button btnAgregarDispositivo) {
        BtnAgregarDispositivo = btnAgregarDispositivo;
    }

    public Button getBtnAgregarModulo() {
        return BtnAgregarModulo;
    }

    public void setBtnAgregarModulo(Button btnAgregarModulo) {
        BtnAgregarModulo = btnAgregarModulo;
    }

    public Button getBtnFiltrarConModulos() {
        return BtnFiltrarConModulos;
    }

    public void setBtnFiltrarConModulos(Button btnFiltrarConModulos) {
        BtnFiltrarConModulos = btnFiltrarConModulos;
    }

    public Button getBtnOrdenarPorPrioridad() {
        return BtnOrdenarPorPrioridad;
    }

    public void setBtnOrdenarPorPrioridad(Button btnOrdenarPorPrioridad) {
        BtnOrdenarPorPrioridad = btnOrdenarPorPrioridad;
    }

    public Button getBtnContarPorTipo() {
        return BtnContarPorTipo;
    }

    public void setBtnContarPorTipo(Button btnContarPorTipo) {
        BtnContarPorTipo = btnContarPorTipo;
    }

    public TextField getLblContadorPorTipo() {
        return lblContadorPorTipo;
    }

    public void setLblContadorPorTipo(TextField lblContadorPorTipo) {
        this.lblContadorPorTipo = lblContadorPorTipo;
    }

    public Label getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(Label lblTipo) {
        this.lblTipo = lblTipo;
    }

    public Label getLblModulo() {
        return lblModulo;
    }

    public void setLblModulo(Label lblModulo) {
        this.lblModulo = lblModulo;
    }
    public TextField getTxfContadorPorTipo() {
        return txfContadorPorTipo;
    }
    public void setTxfContadorPorTipo(TextField txfContadorPorTipo) {
        this.txfContadorPorTipo = txfContadorPorTipo;
    }
    public Button getButtonRegresar() {
        return ButtonRegresar;
    }
    public void setButtonRegresar(Button buttonRegresar) {
        ButtonRegresar = buttonRegresar;
    }

    public void ContarPorTipo(ActionEvent actionEvent) {
    }

    public void OrdenarPorPrioridad(ActionEvent actionEvent) {
    }

    public void FiltrarConModulos(ActionEvent actionEvent) {
    }

    public void AgregarModulo(ActionEvent actionEvent) {
    }

    public void AgregarDispositivo(ActionEvent actionEvent) {

    }
    public void inicializarTablasDispositivoSimple(){
        TableProductos = new TableView<DispositivoSimple>();
        clmEstado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().estado()));
        clmPrioridad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().prioridad())));
        clmTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().tipo()));

    }

    public void Regresar(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("PaginaSeleccionProductoODispositivo.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ButtonRegresar.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
