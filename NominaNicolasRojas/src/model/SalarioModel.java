package model;

public class SalarioModel {
    private final double AUXILIO_TRANSPORTE = 140000;
    private final double SALARIO_MINIMO = 908526;

    public double calcularSalario(double salario) {
        double salarioConAuxilio;
        double descuentoSalud = salario * 0.04;
        double descuentoPension = salario * 0.04;

        if (salario > (2 * SALARIO_MINIMO)) {
            salarioConAuxilio = salario;
        } else {
            salarioConAuxilio = salario + AUXILIO_TRANSPORTE;
        }

        double salarioConDescuentos = salarioConAuxilio - descuentoSalud - descuentoPension;
        return salarioConDescuentos;
    }
}
