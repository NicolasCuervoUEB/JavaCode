import model.SalarioModel;
import view.SalarioView;
import controller.SalarioController;

public class Main {

    public static void main(String[] args) {
        SalarioModel modelo = new SalarioModel();
        SalarioView vista = new SalarioView();
        SalarioController controlador = new SalarioController(modelo, vista);

        controlador.calcularSalarioConDescuentos();
    }
}
