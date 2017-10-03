public class InvertirNumero {
    public  static void main (String[]args){
        InvertirNumero invertir = new InvertirNumero();
        System.out.println("el numero es"  + invertir.invertir(12) );
    }
    public int invertir (int n){

        int a,b;
        int c=0;
        a=n/10;
        b=n%10;
        c=( c * 10) + b;
        n=a;
        a=n/10;
        b=n%10;
        c=(c*10) +b;
        n=a;
        return c;

        do {
            a=n/10;
            b=n%10;
            c=(c*10) + b;
            n=a;

        }while (a>0);



        }
    }



}
