package TakeHome747;

import static org.junit.Assert.*;

import org.junit.Test;

public class TIMETest {
	TIME a747 = new TIME("SW_Testing",1000,1075);
    TIME b747 = new TIME("SW_Testing",5800,5875);
    TIME a750 = new TIME("Algo_analysis",3900,3975);
	TIME b750 = new TIME("Algo_analysis",8700,8775);
	TIME a789 = new TIME("IP_strategies",1800,1980);
	
	TIME a102_012 = new TIME("TA_102a",6020,6070);
	TIME a101_005 = new TIME("TA_101a",10650,10700);
	TIME a101_007 = new TIME("TA_101b",10800,10850);
	TIME a520_001 = new TIME("TA_520a",8830,8890);
	TIME b520_001 = new TIME("TA_520b",11100,11160);
	
	
	
	@Test
	public void testTIME() {
		
		assertEquals(a747.getStartTime(), a747.getStartTime());
		assertFalse(Integer.valueOf(a747.getStartTime()).equals(Integer.valueOf(b747.getStartTime())));
		assertFalse(Integer.valueOf(a750.getStartTime()).equals(Integer.valueOf(a747.getStartTime())));
		assertFalse(Integer.valueOf(a750.getStartTime()).equals(Integer.valueOf(b750.getStartTime())));
		assertEquals(a747.getStartTime(), a747.getStartTime());
		
	}

	@Test
	public void testTIMEIntInt() {
		
		
		
        assertFalse(Integer.valueOf(a101_005.getStartTime()).equals(Integer.valueOf(a101_007.getStartTime())));
        assertTrue(Integer.valueOf(a747.getEndTime()).equals(Integer.valueOf(a747.getEndTime())));
        assertFalse(Integer.valueOf(a102_012.getEndTime()).equals(Integer.valueOf(a750.getEndTime())));
        assertFalse(Integer.valueOf(a747.getStartTime()).equals(Integer.valueOf(b520_001.getStartTime())));
        assertFalse(Integer.valueOf(a520_001.getStartTime()).equals(Integer.valueOf(b520_001.getStartTime())));
	}

	@Test
	public void testGetStartTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStartTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEndTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEndTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDay() {
		
		assertEquals("FRIDAY", a101_005.GetDay());
        assertEquals("WEDNESDAY", b747.GetDay());
        assertEquals("TUESDAY", a750.GetDay());
        assertEquals("THRUSDAY", b750.GetDay());
		
	}

	@Test
	public void testGetTimeOfDay() {
		
		
		a520_001.GetDay();
        assertEquals(1630, a520_001.GetTimeOfDay());
        a102_012.GetDay();
        assertEquals(1220, a102_012.GetTimeOfDay());
         a750.GetDay();
        assertEquals(1500, a750.GetTimeOfDay());
		
	}

	@Test
	public void testOverlap() {
		assertTrue(a750.overlap(a750));
        assertTrue(a520_001.overlap(a520_001));
        
        assertFalse(b750.overlap(a750));
        assertFalse(a747.overlap(a101_005));
        assertFalse(a101_007.overlap(a102_012));
	}

	@Test
	public void testMeetingTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testMeetingTimeStringIntInt() {
		fail("Not yet implemented");
	}

}
