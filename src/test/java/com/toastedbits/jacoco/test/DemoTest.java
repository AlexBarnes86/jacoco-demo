package com.toastedbits.jacoco.test;

import static org.testng.Assert.*;

import java.sql.SQLException;

import org.testng.annotations.Test;

import com.toastedbits.jacoco.JaCoCoDemo;

public class DemoTest {
	@Test
	public void testGetConnection() throws SQLException {
		JaCoCoDemo jccd = new JaCoCoDemo();
		assertEquals(42, jccd.calculateAnswer("What is the answer to the ultimate question of life, the universe and everything?"));
	}
}