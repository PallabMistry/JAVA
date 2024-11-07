public class Speed{
    public void fullThrottle(){
        System.out.println("The car is going as Faster as all. ");
    }
    public void speed(int maxSpeed){
        System.out.println("The Speed: "+maxSpeed);
    }
    public static void main(String[] args) {
        Speed myCar = new Speed();
        myCar.fullThrottle();
        myCar.speed(164);

    }
}