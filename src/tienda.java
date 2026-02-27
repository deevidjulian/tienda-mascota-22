public class tienda {

        private String nombre;
        private String especie;
        private int edad;
        private double peso;
        private boolean vacunado;

        //constructor
public tienda(String nombre,String especie,int edad,double peso)    {

    this.nombre= nombre;
    this.especie= especie;
    this.edad= edad;
    this.peso= peso;
    this.vacunado= false;

}
    public void vacunar() {

        if (!vacunado) {
            vacunado = true;
            System.out.println("La mascota esta vacunada.");
        } else {
            System.out.println("La mascota ya estaba vacunada.");
        }
    }

public  void alimentar (double cantidad) {
    if (cantidad > 0) {
        peso += cantidad;
        System.out.println("la mascota fue alimentada");
    }else {
        System.out.println("no esta permitidad esa cantidad");
    }
}
    public void años() {
        edad++;
        System.out.println("La mascota cumplió un año más.");
    }

    public void mostrarInformacion() {
        System.out.println("----- INFORMACIÓN DE LA MASCOTA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }
}
