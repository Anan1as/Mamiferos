package emamifero;

public class Ornitorrinco extends Mamifero implements Anfibio, Oviparo, Venenoso{
    
    @Override
    public void respiracionBranquial(){
            System.out.println("-sonidos de burbujas-");
    
    }
    
    @Override
    public void respiracionPulmonar() {
        System.out.println("Respirando ando");
    }

    @Override
    public void ponerHuevos(int cant) {
        System.out.println("Puse " + cant + " huevos");
    }

    @Override
    public void envenenar() {
         System.out.println("Tiqui y adioh'");
    }

}
