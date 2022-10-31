public class Ravnobedreni implements Triangle{
    int x,y, alpha;
    Ravnobedreni(int x, int y, int alpha){
        this.x = x;
        this.y = y;
        this.alpha = alpha;
    }
    public double P(){
        return 2*x + Math.sqrt(x*x + y*y - 2*x*y*Math.cos(alpha*Math.PI/180));
    }
    public double S(){
        return 0.5*x*y*Math.sin(alpha*Math.PI/180);
    }
    public void print(){
        System.out.println("Ravnobedreni treugolnik: ");
    }
}
