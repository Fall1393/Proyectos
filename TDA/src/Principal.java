import java.awt.*;

public class Principal {
    public static void main(String[] arg){
        TDA.Punto objetoPunto = new TDA.Punto();
        objetoPunto.setX(66);
        objetoPunto.setX(4);
        objetoPunto.setX(8);
        objetoPunto.setDimension("3D");
        System.out.println("Dimension: "  + objetoPunto.getDimension());
        System.out.println("Cordenada X: "  + objetoPunto.getX());
        System.out.println("Cordenada Y: "  + objetoPunto.getY());
        System.out.println("Cordenada Z: "  + objetoPunto.getZ());
    }
}
