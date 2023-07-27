package cic.es.Ejerc007;

public class Sala {
    private int asientos;
    
    private Sesion sesion;

    public Sala(int asientos, Sesion sesion) {
        this.asientos = asientos;
        this.sesion = sesion;
    }

    public int getAsientos() {
        return asientos;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    @Override
    public String toString() {
        return "Sala [asientos=" + asientos + ", sesion=" + sesion + "]";
    }

    
}
