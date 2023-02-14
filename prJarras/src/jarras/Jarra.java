package jarras;

public class Jarra{
    private int contenido = 0;
    private final int capacidad;

    public Jarra(int capacidad){
        this.capacidad = capacidad;
        contenido = 0;
        if(capacidad < 0){
            throw new RuntimeException();
        }
    }

    public int capacidad(){
        return this.capacidad();
    }

    public int contenido(){
        return this.contenido;
    }

    public void llena(){
        this.contenido = this.capacidad;
    }

    public void vacia(){
        this.contenido = 0;
    }

    public void llenaDesde(Jarra jarra1){
        if(jarra1 == this){
            throw new RuntimeException();
        }
        while(this.contenido < this.capacidad && jarra1.contenido > 0){
            jarra1.contenido--;
            this.contenido++;
        }
    }

    @Override
    public String toString(){
        return ("J(" + this.capacidad + ", " + this.contenido + ")");
    }
}
