package repasoParcial;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Clio", "Campus", 4);
        auto.mostrarInfo();
        auto.setMarca("Honda");
        auto.setModelo("Civic");
        auto.setPuertas(2);
        auto.mostrarInfo();
    }
}
