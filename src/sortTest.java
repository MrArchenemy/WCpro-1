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
	public void testSortMap1() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 0);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +0+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap2() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 65536);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +65536+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap3() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 5);
		testMap.put("test2", 66);
		StringBuilder p=new StringBuilder();
		p.append("test2"+ ": " +66+"\r\n");
		p.append("test1"+ ": " +5+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap4() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test2", 5);
		testMap.put("test1", 66);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +66+"\r\n");
		p.append("test2"+ ": " +5+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap5() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test", 6);
		testMap.put("test6", 55);
		StringBuilder p=new StringBuilder();
		p.append("test6"+ ": " +55+"\r\n");
		p.append("test"+ ": " +6+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap6() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 66);
		testMap.put("test2", 66);
		StringBuilder p=new StringBuilder();
		p.append("test2"+ ": " +66+"\r\n");
		p.append("test1"+ ": " +66+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap7() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 23);
		testMap.put("test2", 45);
		testMap.put("test3", 52);
		StringBuilder p=new StringBuilder();
		p.append("test3"+ ": " +52+"\r\n");
		p.append("test2"+ ": " +45+"\r\n");
		p.append("test1"+ ": " +23+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}

	@Test
	public void testSortMap8() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 78);
		testMap.put("test2", 45);
		testMap.put("test3", 12);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +78+"\r\n");
		p.append("test2"+ ": " +45+"\r\n");
		p.append("test3"+ ": " +12+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap9() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 78);
		testMap.put("test2", 45);
		testMap.put("test3", 78);
		StringBuilder p=new StringBuilder();
		p.append("test3"+ ": " +78+"\r\n");
		p.append("test1"+ ": " +78+"\r\n");
		p.append("test2"+ ": " +45+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap10() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 78);
		testMap.put("test2", 45);
		testMap.put("test3", 78);
		StringBuilder p=new StringBuilder();
		p.append("test3"+ ": " +78+"\r\n");
		p.append("test1"+ ": " +78+"\r\n");
		p.append("test2"+ ": " +45+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap11() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 78);
		testMap.put("test2", 78);
		testMap.put("test3", 78);
		StringBuilder p=new StringBuilder();
		p.append("test2"+ ": " +78+"\r\n");
		p.append("test3"+ ": " +78+"\r\n");
		p.append("test1"+ ": " +78+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap12() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 28);
		testMap.put("test2", 58);
		testMap.put("test3", 68);
		testMap.put("test4", 78);
		StringBuilder p=new StringBuilder();
		p.append("test4"+ ": " +78+"\r\n");
		p.append("test3"+ ": " +68+"\r\n");
		p.append("test2"+ ": " +58+"\r\n");
		p.append("test1"+ ": " +28+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap13() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 58);
		testMap.put("test2", 28);
		testMap.put("test3", 48);
		testMap.put("test4", 78);
		StringBuilder p=new StringBuilder();
		p.append("test4"+ ": " +78+"\r\n");
		p.append("test1"+ ": " +58+"\r\n");
		p.append("test3"+ ": " +48+"\r\n");
		p.append("test2"+ ": " +28+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap14() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 158);
		testMap.put("test2", 128);
		testMap.put("test3", 48);
		testMap.put("test4", 38);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +158+"\r\n");
		p.append("test2"+ ": " +128+"\r\n");
		p.append("test3"+ ": " +48+"\r\n");
		p.append("test4"+ ": " +38+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap15() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 158);
		testMap.put("test2", 128);
		testMap.put("test3", 48);
		testMap.put("test4", 38);
		testMap.put("test5", 28);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +158+"\r\n");
		p.append("test2"+ ": " +128+"\r\n");
		p.append("test3"+ ": " +48+"\r\n");
		p.append("test4"+ ": " +38+"\r\n");
		p.append("test5"+ ": " +28+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap16() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 158);
		testMap.put("test2", 28);
		testMap.put("test3", 48);
		testMap.put("test4", 38);
		testMap.put("test5", 58);
		StringBuilder p=new StringBuilder();
		p.append("test1"+ ": " +158+"\r\n");
		p.append("test5"+ ": " +58+"\r\n");
		p.append("test3"+ ": " +48+"\r\n");
		p.append("test4"+ ": " +38+"\r\n");
		p.append("test2"+ ": " +28+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap17() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 18);
		testMap.put("test2", 28);
		testMap.put("test3", 48);
		testMap.put("test4", 58);
		testMap.put("test5", 78);
		StringBuilder p=new StringBuilder();
		p.append("test5"+ ": " +78+"\r\n");
		p.append("test4"+ ": " +58+"\r\n");
		p.append("test3"+ ": " +48+"\r\n");
		p.append("test2"+ ": " +28+"\r\n");
		p.append("test1"+ ": " +18+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap18() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 1);
		testMap.put("test2", 5);
		testMap.put("test3", 8);
		testMap.put("test4", 18);
		testMap.put("test5", 18);
		StringBuilder p=new StringBuilder();
		p.append("test4"+ ": " +18+"\r\n");
		p.append("test5"+ ": " +18+"\r\n");
		p.append("test3"+ ": " +8+"\r\n");
		p.append("test2"+ ": " +5+"\r\n");
		p.append("test1"+ ": " +1+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap19() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 5);
		testMap.put("test2", 5);
		testMap.put("test3", 8);
		testMap.put("test4", 18);
		testMap.put("test5", 18);
		StringBuilder p=new StringBuilder();
		p.append("test4"+ ": " +18+"\r\n");
		p.append("test5"+ ": " +18+"\r\n");
		p.append("test3"+ ": " +8+"\r\n");
		p.append("test2"+ ": " +5+"\r\n");
		p.append("test1"+ ": " +5+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
	
	@Test
	public void testSortMap20() {
		Map<String, Integer> testMap = new HashMap<String, Integer>(); 
		testMap.put("test1", 5);
		testMap.put("test2", 5);
		testMap.put("test3", 18);
		testMap.put("test4", 18);
		testMap.put("test5", 18);
		StringBuilder p=new StringBuilder();
		p.append("test4"+ ": " +18+"\r\n");
		p.append("test5"+ ": " +18+"\r\n");
		p.append("test3"+ ": " +18+"\r\n");
		p.append("test2"+ ": " +5+"\r\n");
		p.append("test1"+ ": " +5+"\r\n");
		String t=p.toString();
	    assertEquals(t, sort.SortMap(testMap));
	}
}
