package controller;
import model.SalarioModel;
import view.SalarioView;
import java.util.Scanner;

public class SalarioController {
    private SalarioModel modelo;
    private SalarioView vista;

    public SalarioController(SalarioModel modelo, SalarioView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void calcularSalarioConDescuentos() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el salario del usuario:");
            double salario = scanner.nextDouble();

            double salarioConDescuentos = modelo.calcularSalario(salario);

            vista.mostrarSalario(salarioConDescuentos);

            System.out.println("¿Desea calcular otro salario? (S/N):");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        vista.mostrarMensajeDespedida();
    }
}
