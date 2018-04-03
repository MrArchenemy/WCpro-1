import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class sortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSortMap() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 666);
		testMap.put("test2", 5);
		testMap.put("test3", 236);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +666+"\r\n");
		p.append("test3"+ ": " +236+"\r\n");
		p.append("test2"+ ": " +5+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}

}
