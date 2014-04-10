import junit.framework.*;

public class MapControllerTest extends TestCase {

	public void testStepEstimates() {
		MapController mc = new MapController(null);
		mc.setMoney(50);
		assertTrue(mc.time.getText().equals("Money: 50"));
	}

}
