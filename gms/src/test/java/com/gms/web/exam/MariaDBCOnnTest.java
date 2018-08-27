package com.gms.web.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class MariaDBCOnnTest {

	@Test
	public void test() {
		MariaDBConn m = new MariaDBConn();
		assertEquals("hong", m.exam());
	}

}
