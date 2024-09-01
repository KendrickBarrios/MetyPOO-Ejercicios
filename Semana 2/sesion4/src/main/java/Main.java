import models.Calculadora;
import models.Circle;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
        double radio;
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el radio: "));
        Circle circle = new Circle(radio);
        Calculadora calculadora = new Calculadora();
        JOptionPane.showMessageDialog(null, "El area del circulo es: "
                + calculadora.calcularArea(circle));
    }
}
