package Listener;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.listeners.DwsListeners.class)
public class TestCase1 {
	@Test
	public void main() {
		String expected_result = "java";
		String actual_result = "mava";
		assertEquals(actual_result, expected_result);
	}
	@Test
	public void main1() {
		String expected_result = "java";
		String actual_result = "java";
		assertEquals(actual_result, expected_result);
	}

}
