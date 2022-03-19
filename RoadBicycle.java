public class RoadBicycle extends Bicycle{
    private int tireWidth;
    public RoadBicycle(int startCadence,int startGear,int startSpeed,int newTireWidth){
        super(startCadence, startGear,startSpeed);
        this.setTireWidth(newTireWidth);
    }
    public int getTireWidth(){
        return this.tireWidth;
    }
    public void setTireWidth(int newTireWidth){
        this.tireWidth=newTireWidth;
    }

    //overriding method
    public void printDescription(){
        super.printDescription();
        System.out.println("The road bike has "+getTireWidth()+"mm tires.");
    }

}
