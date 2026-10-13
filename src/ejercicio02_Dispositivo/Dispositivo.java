/*En el área de Software debes crear una clase llamada Dispositivo que represente un dispositivo con los atributos nombre,
tipo y estado. La guía propone usar public String nombre, String tipo y public boolean activo, de manera que practiques tanto
el modificador public como el acceso por defecto. La clase debe tener un método público mostrarInformacion() para mostrar los
datos del dispositivo y un método mostrarEstado() con acceso por defecto para indicar si el dispositivo está activo o inactivo.
Después debes crear una clase Main, crear dos objetos de tipo Dispositivo, asignar valores diferentes a cada uno y ejecutar sus
 métodos para mostrar la información. Luego debes modificar solamente uno de los objetos y comprobar que el otro conserva sus propios
 valores. Finalmente, como desafío adicional, debes agregar un método relacionado con el contexto de Software, por ejemplo activar(
y decidir si será public o tendrá acceso por defecto.*/


package ejercicio02_Dispositivo;

public class Dispositivo {

    private String nombre;
    private String tipo;
    private boolean activo;

    // SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // GET
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    public void mostrarEstado() {
        String estado = activo ? " está activo" : " está inactivo";
        System.out.println(nombre + estado);
    }

    public void activar() {
        if (activo == false) {
            activo = true;
            System.out.println(nombre + " ha sido activado");
        }
    }
}