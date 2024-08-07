import startegy.DriveStrategy;
import startegy.SportsDriveStrategy;

public class HighSportsVehicle extends Vehicle{

  public HighSportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
