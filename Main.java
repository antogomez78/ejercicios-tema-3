public class Main {
    public static void main(String[] args) {
        suma(20, 15, 8);

        coche MiCoche = new coche();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        System.out.println(MiCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);

    }
}

class coche {
    public int puertas = 4;

    public void AgregarPuerta() {
        this.puertas++;

    }
}
