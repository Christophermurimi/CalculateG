public class CalculateG{
    public static void main(String[]args){
        double gravity=-9.81;//Earths gravity in m/s^2
        double fallingTime=30;
        double initialVelocity=0.0;
        double finalVelocity=initialVelocity+gravity*fallingTime;
        double initialPosition=0.0;
        double finalPosition=0.5*gravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition;

        outline("The objects position after"+fallingTime+"Second is"+finalPosition+"m.");
        outline("The objects velocity after"+fallingTime+"Second is"+finalVelocity+"m/s.");
    }
    public static double multi(double a,double b){
        return a*b;
    }
    public static double square(double a){
        return a*a;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static void outline(String message){
        System.out.println(message);
    }
}