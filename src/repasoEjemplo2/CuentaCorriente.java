package repasoEjemplo2;

class CuentaCorriente extends Cuenta {
    private double limiteCredito;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteCredito) {
        super(numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean retirar(double monto) {
       if (monto <= getSaldo() + limiteCredito) {
           return super.retirar(monto);
       } else {
           return false;
       }
    }
}