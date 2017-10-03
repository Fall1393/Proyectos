public class TDA {
    public static void main(String[] args){
       TDA OBJFIBO = new TDA();
       System.out.println("la susecion fibonaci de 12 " + OBJFIBO.fibonacciRdecursivo(12));

    }
    public int fibonacciRdecursivo(int n){
        if (n==1 || n==2){
            return 1;
        }else{
            return fibonacciRdecursivo(n-1) + fibonacciRdecursivo(n-2);
        }
    }
}
