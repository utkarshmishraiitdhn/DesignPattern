import startegy.DriveStrategy;
import startegy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
