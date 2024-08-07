import startegy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
   public   NormalVehicle(){
     super(new NormalDriveStrategy());
   }
}
