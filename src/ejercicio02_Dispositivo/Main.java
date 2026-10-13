package ejercicio02_Dispositivo;

public class Main {

    public static void main(String[] args) {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        // SET: poner valores
        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(false);

        dispositivo2.setNombre("Impresora");
        dispositivo2.setTipo("Periferico");
        dispositivo2.setActivo(false);

        // GET: obtener valores
        System.out.println("Nombre dispositivo 1: " + dispositivo1.getNombre());
        System.out.println("Tipo dispositivo 1: " + dispositivo1.getTipo());
        System.out.println("Activo dispositivo 1: " + dispositivo1.getActivo());

        System.out.println();

        dispositivo2.activar();

        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();

        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();
    }
}
