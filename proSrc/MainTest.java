import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testTime() throws IOException {
		String filepath="big3.txt";
		String outpath="result.txt";
		Map<String, Integer> sum=Main.scan(filepath);
		String res=Main.SortMap(sum);
        Main.writetxt(res,outpath);
		assertTrue(true);
	}

	/*@Test
	public void testScan() throws IOException {
		String filepath="big1.c";
		Main.scan(filepath);
		assertTrue(true);
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
	    assertEquals(t, Main.SortMap(testMap));
	}

	@Test
	public void testWritetxt() {
		fail("Not yet implemented");
	}
	*/

}
