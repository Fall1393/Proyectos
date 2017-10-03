public class funcionrecursiva {
    public int producto(int A, int B){
        if(A==1){
            return(B);
        }
        if(A%2!=0){
            return(B+producto(A/2 , B*2));
        }
        else{
            return(producto(A/2 , B*2));
        }

    }

}
