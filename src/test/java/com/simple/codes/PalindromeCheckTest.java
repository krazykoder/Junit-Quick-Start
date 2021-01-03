package com.simple.codes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

	PalindromeCheck pd = new PalindromeCheck();
	@Test
	void testIsPalindrome() {
		Assert.assertEquals(pd.isPalindrome("madam"), true);
	}

	@Test
	void testIsPalindrome2() {
		Assert.assertEquals(pd.isPalindrome("hello"), false);
	}
	
	@Test
	void testTestthis2() {
//		fail("Not yet implemented");
	}

}
