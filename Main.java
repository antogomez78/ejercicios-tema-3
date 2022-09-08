public class Main {
    public static void main(String[] args) {
       coche MiCoche = new coche();
       MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();
        MiCoche.AgregarPuerta();

        System.out.println(MiCoche.puertas);
    }






}

class coche{
    public int puertas = 0;
    public void AgregarPuerta(){
     this.puertas++;

        }
}