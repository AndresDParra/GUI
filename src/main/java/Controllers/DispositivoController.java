package Controllers;

import com.example.correccionparcial.model.Dispositivo;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.List;

public class DispositivoController {

    public TableView<Dispositivo> tblDispositivos;
    public TableColumn<String, Dispositivo> clmNombre;
    public TableColumn<String, Dispositivo> clmEstado;
    public TableColumn<Integer, Dispositivo> clmPrioridad;
    public TableColumn<String, Dispositivo> clmTipo;
    public TableColumn<Boolean, Dispositivo> clmActivo;
    public TableColumn<List<String>, Dispositivo> clmModulos;
    public Label lblNombre;
    public Label lblEstado;
    public Label lblPrioridad;
    public Button BtnAgregarDispositivo;
    public Button BtnAgregarModulo;
    public Button BtnFiltrarConModulos;
    public Button BtnOrdenarPorPrioridad;
    public Button BtnContarPorTipo;
    public Label lblTipo;
    public Label lblModulo;
    public TextField txfContadorPorTipo;

    public DispositivoController(TableView<Dispositivo> tblDispositivos, TableColumn<String, Dispositivo> clmNombre, TableColumn<String, Dispositivo> clmEstado, TableColumn<Integer, Dispositivo> clmPrioridad, TableColumn<String, Dispositivo> clmTipo, TableColumn<Boolean, Dispositivo> clmActivo, TableColumn<List<String>, Dispositivo> clmModulos, Label lblNombre, Label lblEstado, Label lblPrioridad, Button btnAgregarDispositivo, Button btnAgregarModulo, Button btnFiltrarConModulos, Button btnOrdenarPorPrioridad, Button btnContarPorTipo, Label lblTipo, Label lblModulo, TextField txfContadorPorTipo) {
        this.tblDispositivos = tblDispositivos;
        this.clmNombre = clmNombre;
        this.clmEstado = clmEstado;
        this.clmPrioridad = clmPrioridad;
        this.clmTipo = clmTipo;
        this.clmActivo = clmActivo;
        this.clmModulos = clmModulos;
        this.lblNombre = lblNombre;
        this.lblEstado = lblEstado;
        this.lblPrioridad = lblPrioridad;
        BtnAgregarDispositivo = btnAgregarDispositivo;
        BtnAgregarModulo = btnAgregarModulo;
        BtnFiltrarConModulos = btnFiltrarConModulos;
        BtnOrdenarPorPrioridad = btnOrdenarPorPrioridad;
        BtnContarPorTipo = btnContarPorTipo;
        this.lblTipo = lblTipo;
        this.lblModulo = lblModulo;
        this.txfContadorPorTipo = txfContadorPorTipo;
    }

    public void DispositvoController() {
    }

    public TableView<Dispositivo> getTblDispositvos() {
        return tblDispositivos;
    }

    public TableView<Dispositivo> getTblDispositivos() {
        return tblDispositivos;
    }

    public void setTblDispositivos(TableView<Dispositivo> tblDispositivos) {
        this.tblDispositivos = tblDispositivos;
    }

    public TableColumn<String, Dispositivo> getClmNombre() {
        return clmNombre;
    }

    public void setClmNombre(TableColumn<String, Dispositivo> clmNombre) {
        this.clmNombre = clmNombre;
    }

    public TableColumn<String, Dispositivo> getClmEstado() {
        return clmEstado;
    }

    public void setClmEstado(TableColumn<String, Dispositivo> clmEstado) {
        this.clmEstado = clmEstado;
    }

    public TableColumn<Integer, Dispositivo> getClmPrioridad() {
        return clmPrioridad;
    }

    public void setClmPrioridad(TableColumn<Integer, Dispositivo> clmPrioridad) {
        this.clmPrioridad = clmPrioridad;
    }

    public TableColumn<String, Dispositivo> getClmTipo() {
        return clmTipo;
    }

    public void setClmTipo(TableColumn<String, Dispositivo> clmTipo) {
        this.clmTipo = clmTipo;
    }

    public TableColumn<Boolean, Dispositivo> getClmActivo() {
        return clmActivo;
    }

    public void setClmActivo(TableColumn<Boolean, Dispositivo> clmActivo) {
        this.clmActivo = clmActivo;
    }

    public TableColumn<List<String>, Dispositivo> getClmModulos() {
        return clmModulos;
    }

    public void setClmModulos(TableColumn<List<String>, Dispositivo> clmModulos) {
        this.clmModulos = clmModulos;
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

    public void AgregarDispositivo(ActionEvent actionEvent) {

    }

    public void AgregarModulo(ActionEvent actionEvent) {

    }

    public void FiltrarConModulos(ActionEvent actionEvent) {

    }

    public void OrdenarPorPrioridad(ActionEvent actionEvent) {

    }

    public void ContarPorTipo(ActionEvent actionEvent) {

    }
}
