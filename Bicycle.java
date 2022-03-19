public class Bicycle { // super class
    int cadence;
    int gear;
    int speed;

    public Bicycle(int startCadence,int startGear,int startSpeed){ // constructor
        this.speed=startSpeed;
        this.cadence=startCadence;
        this.gear=startGear;
    }
    public void printDescription(){
        System.out.println("\n Bike is"+" in gear "+this.gear+" with a cadence of "+this.cadence+" and travelling at a speed of " +
               this.speed+"." );
    }


}
