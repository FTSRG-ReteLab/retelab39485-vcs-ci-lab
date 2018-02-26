package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.time.LocalTime;


public class TrainUserImpl implements TrainUser {

	private TrainController controller;
	private int joystickPosition;
	Table<LocalTime, Integer, Integer> tachoGraphTable;
	
	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
	 tachoGraphTable =  HashBasedTable.create();
		
	}

	public void addToTacho(int jp, int s){
		LocalTime t = LocalTime.now();
		tachoGraphTable.put(t, jp, s);
	}
	
	@Override
	public boolean getAlarmFlag() {
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		controller.setJoystickPosition(joystickPosition);
	}

}
