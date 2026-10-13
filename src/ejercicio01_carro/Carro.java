package ejercicio01_carro;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    métodos para establecer valor
    set()
    "siempre" es void
    siempre recibe parámetro
    parámetro generalmente es del mismo tipo del atributo
     */
    public void setPotencia(int potencia){
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        if(velocidad < 0)
            velocidad = 0;

        this.velocidad = velocidad;
    }

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }
}
