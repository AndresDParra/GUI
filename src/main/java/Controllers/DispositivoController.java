package Controllers;

import com.example.correccionparcial.model.*;
import eu.hansolo.tilesfx.tools.Fire;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class DispositivoController {
    @FXML
    public TableView<DispositivoSimple> tblDispositivos;
    @FXML
    public TableColumn<DispositivoSimple, String> clmEstado;
    @FXML
    public TableColumn<DispositivoSimple, String> clmPrioridad;
    @FXML
    public TableColumn<DispositivoSimple, String> clmTipo;
    @FXML
    public Button BtnAgregarDispositivo;
    @FXML
    public Button BtnAgregarModulo;
    @FXML
    public Button BtnFiltrarConModulos;
    @FXML
    public Button BtnOrdenarPorPrioridad;
    @FXML
    public Button BtnContarPorTipo;
    @FXML
    public TextField lblContadorPorTipo;
    @FXML
    public TextField txfContadorPorTipo;
    @FXML
    public Button ButtonRegresar;
    @FXML
    public TableColumn<DispositivoCompuesto, String> clmEstado1;
    @FXML
    public TableView<DispositivoCompuesto> tblDispositivos1;
    @FXML
    public TableColumn<DispositivoCompuesto, String> clmPrioridad1;
    @FXML
    public TableColumn<DispositivoCompuesto, String> clmTipo1;
    @FXML
    public TextField txfNombre;
    @FXML
    public TextField txfEstado;
    @FXML
    public TextField txfPrioridad;
    @FXML
    public TextField txfTipo;
    @FXML
    public TextField txfModulo;

    public DispositivoController(Button btnAgregarDispositivo, Button btnAgregarModulo, Button btnFiltrarConModulos, Button btnOrdenarPorPrioridad, Button btnContarPorTipo, TextField lblContadorPorTipo, TextField txfContadorPorTipo, Button buttonRegresar, TextField txfNombre, TextField txfEstado, TextField txfPrioridad, TextField txfTipo, TextField txfModulo) {
        BtnAgregarDispositivo = btnAgregarDispositivo;
        BtnAgregarModulo = btnAgregarModulo;
        BtnFiltrarConModulos = btnFiltrarConModulos;
        BtnOrdenarPorPrioridad = btnOrdenarPorPrioridad;
        BtnContarPorTipo = btnContarPorTipo;
        this.lblContadorPorTipo = lblContadorPorTipo;
        this.txfContadorPorTipo = txfContadorPorTipo;
        ButtonRegresar = buttonRegresar;
        this.txfNombre = txfNombre;
        this.txfEstado = txfEstado;
        this.txfPrioridad = txfPrioridad;
        this.txfTipo = txfTipo;
        this.txfModulo = txfModulo;
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

    public TextField getTxfNombre() {
        return txfNombre;
    }

    public void setTxfNombre(TextField txfNombre) {
        this.txfNombre = txfNombre;
    }

    public TextField getTxfEstado() {
        return txfEstado;
    }

    public void setTxfEstado(TextField txfEstado) {
        this.txfEstado = txfEstado;
    }

    public TextField getTxfPrioridad() {
        return txfPrioridad;
    }

    public void setTxfPrioridad(TextField txfPrioridad) {
        this.txfPrioridad = txfPrioridad;
    }

    public TextField getTxfTipo() {
        return txfTipo;
    }

    public void setTxfTipo(TextField txfTipo) {
        this.txfTipo = txfTipo;
    }

    public TextField getTxfModulo() {
        return txfModulo;
    }

    public void setTxfModulo(TextField txfModulo) {
        this.txfModulo = txfModulo;
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
        String modulo = txfModulo.getText();
        TableView<DispositivoSimple> dispositivosFiltrados = new TableView<>();
        for (DispositivoSimple dispositivo : tblDispositivos.getItems()) {
            if (dispositivo.tipo().contains(modulo)) {
                dispositivosFiltrados.getItems().add(dispositivo);
            }
        }
        tblDispositivos.setItems(dispositivosFiltrados.getItems());

    }

    public void AgregarModulo(ActionEvent actionEvent) {
        String nombre = txfNombre.getText();
        String estado = txfEstado.getText();
        int prioridad = Integer.parseInt(txfPrioridad.getText());
        DispositivoSimple dispositivo = new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad);
        tblDispositivos.getItems().add(dispositivo);
    }

    public void AgregarDispositivo(ActionEvent actionEvent) {
        String nombre = txfNombre.getText();
        String estado = txfEstado.getText();
        int prioridad = Integer.parseInt(txfPrioridad.getText());
        int modulo = Integer.parseInt(txfModulo.getText());

        DispositivoSimple dispositivo = new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad);

        if (txfModulo.getText().isEmpty() ) {

            tblDispositivos.getItems().add(dispositivo);
        } else {
            if (modulo == 1){
                DispositivoCompuesto dispositivoCompuesto = new DispositivoCompuesto(nombre);
                dispositivoCompuesto.agregar(new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad));
                Firewall firewall = new Firewall(dispositivoCompuesto);
                tblDispositivos1.getItems().add(dispositivoCompuesto);
            }
            if (modulo == 2){
                DispositivoCompuesto dispositivoCompuesto = new DispositivoCompuesto(nombre);
                dispositivoCompuesto.agregar(new DispositivoSimple(nombre, Boolean.parseBoolean(estado), prioridad));
                DetectorIntrusos detectorIntrusos = new DetectorIntrusos(dispositivoCompuesto);
                tblDispositivos1.getItems().add(dispositivoCompuesto);
            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Invalid Module");
                alert.setContentText("Please select a valid module (1 or 2).");
                alert.showAndWait();
            }
        }
        txfNombre.clear();
        txfEstado.clear();
        txfPrioridad.clear();
        txfModulo.clear();

    }

    public void Regresar(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("PaginaSeleccionProductoODispositivo.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ButtonRegresar.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void initialize() throws IOException {
        try {
            // Call your existing initialization method
            inicializarTablasDispositivoCompuesto();

            // Initialize empty ObservableLists if needed
            if (tblDispositivos.getItems() == null) {
                tblDispositivos.setItems(FXCollections.observableArrayList());
            }


            if (tblDispositivos1.getItems() == null) {
                tblDispositivos1.setItems(FXCollections.observableArrayList());
            }

        }catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Initialization Error");
            alert.setContentText("An error occurred during initialization: " + e.getMessage());
            alert.showAndWait();
        }
    }

    public void inicializarTablasDispositivoCompuesto() throws IOException {
        // Initialize tables (code moved from static methods)
        clmEstado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().estado()));
        clmPrioridad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().prioridad())));
        clmTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().tipo()));

        clmEstado1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().estado()));
        clmPrioridad1.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().prioridad())));
        clmTipo1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().tipo()));

        System.out.println("tblDispositivos: " + (tblDispositivos == null ? "null" : "initialized"));
        System.out.println("clmEstado: " + (clmEstado == null ? "null" : "initialized"));
        System.out.println("clmPrioridad: " + (clmPrioridad == null ? "null" : "initialized"));
        System.out.println("clmTipo: " + (clmTipo == null ? "null" : "initialized"));

        System.out.println("tblDispositivos1: " + (tblDispositivos1 == null ? "null" : "initialized"));
        System.out.println("clmEstado1: " + (clmEstado1 == null ? "null" : "initialized"));
        System.out.println("clmPrioridad1: " + (clmPrioridad1 == null ? "null" : "initialized"));
        System.out.println("clmTipo1: " + (clmTipo1 == null ? "null" : "initialized"));
    }
}