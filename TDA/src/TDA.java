public class TDA {
    public static class Punto {
        private int  x, y, z;
        String dimension;

        public Punto (int coorx, int coory){
            this.x=coorx;
                    this.y=coory;
        }
        public Punto (int coorx, int coory, int coorz){
            this.x=coorx;
                    this.y=coory;
                            this.z=coorz;
        }
        public Punto(){
            this.x=0;
            this.y=0;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
        public String getDimension(){
            return dimension;
        }
        void setX(int valorX){
            this.x=valorX;
        }
        void setY(int valorY){
            this.y=valorY;
        }
        void setZ(int valorZ){
            this.z=valorZ;
        }
        void setDimension(String dimen){
            this.dimension=dimen;
        }

    }
}
