package ehb.dt.command.remote;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	public void execute() {
		garageDoor.down();
		garageDoor.lightOff();
	}
}