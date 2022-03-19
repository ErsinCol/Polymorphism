public class MountainBicycle extends  Bicycle{
   private String suspension;
   public MountainBicycle(int startCadence,int startGear,int startSpeed,String suspensionType){
       super(startCadence,startGear,startSpeed);
       this.setSuspension(suspensionType);
   }
    public String getSuspension(){
        return this.suspension;
    }
   public void setSuspension(String suspension){
       this.suspension=suspension;
   }
    public void printDescription(){ // overriding method
        super.printDescription();
        System.out.println("The mountain bike has a"+getSuspension()+" suspension.");
    }

}
