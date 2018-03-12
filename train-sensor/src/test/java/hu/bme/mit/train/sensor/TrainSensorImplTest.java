package hu.bme.mit.train.sensor;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImplTest {

	TrainController tc;
	TrainUser tu;
	TrainSensorImpl tsi;
	
	@Before
	public void init(){
		tc = mock(TrainController.class);
		tu = mock(TrainUser.class);
		tsi = new TrainSensorImpl(tc, tu);
		
	}
	
	@Test
	public void trainSpeedGreaterThan500() {
		
		
		tsi.overrideSpeedLimit(501);
		assertEquals(true, tsi.getAlarmState());
		
	}
	@Test
	public void trainSpeedLessThan0() {
		
		tsi.overrideSpeedLimit(-10);
		assertEquals(true, tsi.getAlarmState());
		
	}
	@Test
	public void trainSpeedAtLimit() {

		
		tsi.overrideSpeedLimit(500);
		assertEquals(false, tsi.getAlarmState());
		
	}
	@Test
	public void trainSpeedOk() {
		tsi.overrideSpeedLimit(100);
		assertEquals(false, tsi.getAlarmState());
		
	}

}
