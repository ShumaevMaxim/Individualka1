public class Ravnostoron implements Triangle{
    int x,y, alpha;
    Ravnostoron(int x, int y, int alpha){
        this.x = x;
        this.y = y;
        this.alpha = alpha;
    }
    public double P(){
        return 3*x;
    }
    public double S(){
        return x*x*Math.sqrt(3)/4;
    }
    public void print(){
        System.out.println("Ravnostoroni treugolnik: ");
    }
}
