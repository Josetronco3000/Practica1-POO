package jarras;

public class Mesa {
    private Jarra jarra1;
    private Jarra jarra2;
    public Mesa(Jarra jarra1, Jarra jarra2){
        if(jarra1 == jarra2){
            throw new RuntimeException();
        }else{
            this.jarra1 = jarra1;
            this.jarra2 = jarra2;
        }
    }

    public Mesa(int capacidad1, int capacidad2){
        jarra1 = new Jarra(capacidad1);
        jarra2 = new Jarra(capacidad2);
    }

    public int capacidad(int num){
        if(num == 1){
            return this.jarra1.capacidad();
        }else if(num == 2){
            return this.jarra2.capacidad();
        }else{
            throw new RuntimeException();
        }
    }

    public int contenido(int num){
        if(num == 1){
            return this.jarra1.contenido();
        }else if(num == 2){
            return this.jarra2.contenido();
        }else{
            throw new RuntimeException();
        }
    }

    public void llena(int num){
        if(num == 1){
            jarra1.llena();
        }else if(num == 2){
            jarra2.llena();
        }else{
            throw new RuntimeException();
        }
    }

    public void vacia(int num){
        if(num == 1){
            jarra1.vacia();
        }else if(num == 2){
            jarra2.vacia();
        }else{
            throw new RuntimeException();
        }
    }

    public void llenaDesde(int num){
        if(num == 1){
            jarra2.llenaDesde(jarra1);
        }else if(num == 2){
            jarra1.llenaDesde(jarra2);
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public String toString(){
        return ("M("+ jarra1 + ", " + jarra2 + ")");
    }
}
