import java.util.Scanner;

public class Mascota {
    public  static void  main(String[]args){

        Scanner teclado= new Scanner(System.in);


        System.out.print(("escriba el nombre de tu mascota:"));
        String nombre = teclado.next();

        System.out.print("Ingrese la especie: ");
        String especie = teclado.next();



        System.out.print(" escriba la edad");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el peso: ");
        double peso = teclado.nextDouble();

        Mascota m1 = new Mascota(nombre,especie,edad,peso);

        int opcion;

        do {

        System.out.println("***menu***");
        System.out.println("1. informacion");
        System.out.println("2 alimentar");
        System.out.println("3.vacunar");
        System.out.println("4. cumplir años");
        System.out.println("5. salir");
        System.out.println("selecione una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    m1.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese cantidad de alimento: ");
                    double cantidad = teclado.nextDouble();
                    m1.alimentar(cantidad);
                    break;

                case 3:
                    m1.vacunar();
                    break;

                case 4:
                    m1.cumplirAnios();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        System.out.println("\nInformación final:");
        m1.mostrarInformacion();

        teclado.close();
        }

    }
