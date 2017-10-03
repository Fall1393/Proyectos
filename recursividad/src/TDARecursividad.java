public class TDARecursividad {
    public static void main (String[] args){
        TDARecursividad objeto = new TDARecursividad();
        objeto.bajarEscalera(20);
    }
    public void bajarEscalera (int escalones){
        if (escalones==0) {
            System.out.println("Has terminado");
        }else{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("bajando" + escalones);
            bajarEscalera(escalones - 1);

        }
    }
}
