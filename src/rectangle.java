public class rectangle {
    double length;
    double breadth;
    public rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculatearea(){
        return length*breadth;
    }
   double calculateperimeter(){
        return 2*(length+breadth);
    }
}
