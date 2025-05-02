package com.example.correccionparcial.model;

import java.util.*;

/**
 * Singleton que gestiona un registro global de productos.
 */
public class RegistroGlobal {
    private static RegistroGlobal instancia;
    private List<Producto> productos = new ArrayList<>();

    private RegistroGlobal() {
    }

    public static RegistroGlobal getInstancia() {
        if (instancia == null)
            instancia = new RegistroGlobal();
        return instancia;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void mostrar() {
        System.out.println("\nProductos en Registro Global:");
        productos.forEach(System.out::println);
    }
    public static void inicializarClases(){
        AnalizadorProductos analizador = new AnalizadorProductos();

        // 1. PARTE DE PRODUCCIÓN
        System.out.println("REGISTRO DE PRODUCTOS PERSONALIZADOS");

        Producto p1 = new Producto.Builder().setNombre("Jugo Verde").addComponente("Limón").addComponente("Espinaca").setPrecio(12).build();
        Producto p2 = new Producto.Builder().setNombre("Jugo Rojo").addComponente("Fresa").addComponente("Remolacha").setPrecio(15).build();
        Producto p3 = new Producto.Builder().setNombre("Ensalada Mix").addComponente("Tomate").addComponente("Queso").setPrecio(10).build();

        RegistroGlobal rg = RegistroGlobal.getInstancia();
        rg.agregarProducto(p1);
        rg.agregarProducto(p2);
        rg.agregarProducto(p3);

        Dispositivo camara = new DispositivoSimple("Cámara", true, 3);
        Dispositivo sensor = new DispositivoSimple("Sensor", false, 2);

        Dispositivo firewallSensor = new Firewall(sensor);
        Dispositivo intrusosCamara = new DetectorIntrusos(camara);

        DispositivoCompuesto central = new DispositivoCompuesto("Central de Control");
        central.agregar(firewallSensor);
        central.agregar(intrusosCamara);
        List<Dispositivo> lista = new ArrayList<>(Arrays.asList(central, camara, sensor, firewallSensor));
        CentralMonitoreo cm = new CentralMonitoreo(lista);
        CentralMonitoreo.getDispositivos().add(camara);
        CentralMonitoreo.getDispositivos().add(sensor);
        CentralMonitoreo.getDispositivos().add(firewallSensor);
        CentralMonitoreo.getDispositivos().add(intrusosCamara);
        CentralMonitoreo.getDispositivos().add(central);    
    }
}