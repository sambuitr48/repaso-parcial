package repasoEjemplo2;

import javax.swing.*;

public class MainCajero {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente("1698764", 1000, 500);
        String montoStr = JOptionPane.showInputDialog("Ingrese el monto a retirar");
        double monto = Double.parseDouble(montoStr);

        if (cuenta.retirar(monto)){
            JOptionPane.showInputDialog(null, "Retiro exitoso. Saldo actual: " + cuenta.getSaldo());
            JOptionPane.showInputDialog(null, "Fondos insuficientes");
        }
    }
}
