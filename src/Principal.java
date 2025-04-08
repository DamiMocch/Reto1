//Se añade la clase Paciente
import java.util.Scanner;

public class Principal {
//    MAIN
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
//        CREACION DE OBJETO
        Paciente paciente1 = new Paciente();

//     Solicitar los datos al usuario y asignarlos al onjeto

        System.out.print("Ingrese el nombre del paciente: ");
        paciente1.nombrePaciente = datos.nextLine();

        System.out.print("Edad del paciente: ");
        paciente1.edad = datos.nextInt();
        datos.nextLine();

        System.out.print("Expediente del paciente: ");
        paciente1.expediente = datos.nextLine();


//        LLAMAMOS AL METODO
        paciente1.mostrarInformacion();
    }
}
