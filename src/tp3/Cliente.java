package tp3;

import java.time.LocalDate;
import java.util.*;

public class Cliente {
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaNacimiento;
    private String dni;
    private String cp ;
    private String ciduad;
    private double saldo;
    private String nombreCarrera;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCp() {
        return cp;
    }

    public String getCiduad() {
        return ciduad;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public String getDni() {
        return dni;
    }

    public Cliente(String nombre, String apellido, String domicilio, LocalDate fechaNacimiento, String dni, String cp, String ciduad, double saldo, String nombreCarrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.cp = cp;
        this.ciduad = ciduad;
        this.saldo = saldo;
        this.nombreCarrera = nombreCarrera;
    }

    public static void main(String[] args) {
        Map<String, Cliente> clientesPorDni = new HashMap<>();
        Map<String, List<Cliente>> clientesPorCp = new HashMap<>();
        TreeMap<Double, List<Cliente>> clientesPorSaldo = new TreeMap<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente a= new Cliente("Sofía","Martínez","Calle Falsa 123",LocalDate.of(2001, 3, 15), "45321678", "5000", "Córdoba", 1200.50, "Ingeniería en Sistemas");
        clientes.add(a);
        for(Cliente c : clientes) {
            //dni
            clientesPorDni.put(c.getDni(), c);
            //cp
            clientesPorCp.computeIfAbsent(c.cp, k -> new ArrayList<>()).add(c);
            //saldo
            clientesPorSaldo.computeIfAbsent(c.saldo, k -> new ArrayList<>()).add(c);
        }
    }
}
