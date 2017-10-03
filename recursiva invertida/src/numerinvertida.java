public class numerinvertida {
    public static  void main (String[] args){
        //numerinvertida objeto = new numerinvertida();
        //objeto.invertir(1355);
    }
   public void invertir (int n){


       int a = n;
       int b;
       int c = 0;
       do{
           a=(int)a/10;
                   b=a%10;
                           c=(c * 10)+10;
       }while (a==0);
       System.out.println(c);
       //invertir(n-1);
   }
}
