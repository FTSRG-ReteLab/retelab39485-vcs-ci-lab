package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);
	
	int getSpeedLimit();

	void setJoystickPosition(int joystickPosition);

}