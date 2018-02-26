import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class tachographTest {

	@Test
	public void test() {
		Table<LocalTime, Integer, Integer> tachoGraphTable = HashBasedTable.create();
		LocalTime t = LocalTime.now();
		tachoGraphTable.put(t, 1, 10);
		assertFalse("Table emptiness test", tachoGraphTable.isEmpty());
	}

}
