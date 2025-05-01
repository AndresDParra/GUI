package Controllers;

import com.example.correccionparcial.model.DispositivoCompuesto;
import com.example.correccionparcial.model.DispositivoSimple;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Comparator;

public class DispositivoController {
    public TableView<DispositivoSimple> tblDispositivos;
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
    public TableColumn<DispositivoCompuesto, String> clmEstado1;
    public TableView<DispositivoCompuesto> tblDispositivos1;
    public TableColumn<DispositivoCompuesto, String> clmPrioridad1;
    public TableColumn<DispositivoCompuesto, String> clmTipo1;

    public DispositivoController(TableView<DispositivoSimple> tblDispositivos, TableColumn<DispositivoSimple, String> clmEstado, TableColumn<DispositivoSimple, String> clmPrioridad, TableColumn<DispositivoSimple, String> clmTipo, Label lblNombre, Label lblEstado, Label lblPrioridad, Button btnAgregarDispositivo, Button btnAgregarModulo, Button btnFiltrarConModulos, Button btnOrdenarPorPrioridad, Button btnContarPorTipo, TextField lblContadorPorTipo, Label lblTipo, Label lblModulo, TextField txfContadorPorTipo, Button buttonRegresar, TableColumn<DispositivoCompuesto, String> clmEstado1, TableView<DispositivoCompuesto> tblDispositivos1, TableColumn<DispositivoCompuesto, String> clmPrioridad1, TableColumn<DispositivoCompuesto, String> clmTipo1) {
        this.tblDispositivos = tblDispositivos;
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
        this.clmEstado1 = clmEstado1;
        this.tblDispositivos1 = tblDispositivos1;
        this.clmPrioridad1 = clmPrioridad1;
        this.clmTipo1 = clmTipo1;
    }

    public DispositivoController() {
    }

    public TableView<DispositivoSimple> getTblDispositivos() {
        return tblDispositivos;
    }

    public void setTblDispositivos(TableView<DispositivoSimple> tblDispositivos) {
        this.tblDispositivos = tblDispositivos;
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

    public TableColumn<DispositivoCompuesto, String> getClmEstado1() {
        return clmEstado1;
    }

    public void setClmEstado1(TableColumn<DispositivoCompuesto, String> clmEstado1) {
        this.clmEstado1 = clmEstado1;
    }

    public TableView<DispositivoCompuesto> getTblDispositivos1() {
        return tblDispositivos1;
    }

    public void setTblDispositivos1(TableView<DispositivoCompuesto> tblDispositivos1) {
        this.tblDispositivos1 = tblDispositivos1;
    }

    public TableColumn<DispositivoCompuesto, String> getClmPrioridad1() {
        return clmPrioridad1;
    }

    public void setClmPrioridad1(TableColumn<DispositivoCompuesto, String> clmPrioridad1) {
        this.clmPrioridad1 = clmPrioridad1;
    }

    public TableColumn<DispositivoCompuesto, String> getClmTipo1() {
        return clmTipo1;
    }

    public void setClmTipo1(TableColumn<DispositivoCompuesto, String> clmTipo1) {
        this.clmTipo1 = clmTipo1;
    }

    public void ContarPorTipo(ActionEvent actionEvent) {
        int contador = 0;
        String tipo = txfContadorPorTipo.getText();
        for (DispositivoSimple dispositivo : tblDispositivos.getItems()) {
            if (dispositivo.tipo().equals(tipo)) {
                contador++;
            }
        }
        lblContadorPorTipo.setText("Cantidad de dispositivos de tipo " + tipo + ": " + contador);
    }

    public void OrdenarPorPrioridad(ActionEvent actionEvent) {
        tblDispositivos.getItems().sort(Comparator.comparingInt(DispositivoSimple::prioridad));
        tblDispositivos.refresh();
    }

    public void FiltrarConModulos(ActionEvent actionEvent) {
        String modulo = lblModulo.getText();
        TableView<DispositivoSimple> dispositivosFiltrados = new TableView<>();
        for (DispositivoSimple dispositivo : tblDispositivos.getItems()) {
            if (dispositivo.tipo().contains(modulo)) {
                dispositivosFiltrados.getItems().add(dispositivo);
            }
        }
        tblDispositivos.setItems(dispositivosFiltrados.getItems());

    }

    public void AgregarModulo(ActionEvent actionEvent) {
        String nombre = lblNombre.getText();
        String estado = lblEstado.getText();
        int prioridad = Integer.parseInt(lblPrioridad.getText());
        DispositivoSimple dispositivo = new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad);
        tblDispositivos.getItems().add(dispositivo);
    }

    public void AgregarDispositivo(ActionEvent actionEvent) {
        String nombre = lblNombre.getText();
        String estado = lblEstado.getText();
        int prioridad = Integer.parseInt(lblPrioridad.getText());
        DispositivoSimple dispositivo = new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad);
        tblDispositivos.getItems().add(dispositivo);

    }
    public void inicializarTablasDispositivoSimple(){
        tblDispositivos = new TableView<DispositivoSimple>();
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
    public void inicializarTablasDispositivoCompuesto() {
        tblDispositivos1 = new TableView<>();
        clmEstado1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().estado()));
        clmPrioridad1.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().prioridad())));
        clmTipo1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().tipo()));
    }
}
