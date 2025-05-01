package Controllers;

import com.example.correccionparcial.model.DispositivoSimple;
import com.example.correccionparcial.model.DispositivoCompuesto;
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
    public TextField lblContadorPorTipo;
    public Label lblTipo;
    public Label lblModulo;

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
