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

}
