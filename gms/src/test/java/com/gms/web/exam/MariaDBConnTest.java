package com.gms.web.exam;
import static org.junit.Assert.*;
import org.junit.Test;
import com.gms.web.test.MariaDBConn;

public class MariaDBConnTest {

	@Test
	public void test() {
		System.out.println("=========");
		MariaDBConn m = new MariaDBConn();
		assertEquals("CVS030", m.exam());
		System.out.println();
	
	}

}
