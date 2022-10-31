public class Pryamoug implements Triangle {
    int x,y, alpha;
    Pryamoug(int x, int y, int alpha){
        this.x = x;
        this.y = y;
        this.alpha = alpha;
    }
    public double P(){
        return x + y + Math.sqrt(x*x + y*y);
    }
    public double S(){
        return 0.5*x*y;
    }
    public void print(){
        System.out.println("Pryamougolni treugolnik: ");
    }
}
