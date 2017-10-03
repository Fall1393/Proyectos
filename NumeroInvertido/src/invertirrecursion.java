public class invertirrecursion {
    if (n<10){
        return n;
    }else {
        return invertirrecursion(n/10)*10 + (n%10);

    }
}
