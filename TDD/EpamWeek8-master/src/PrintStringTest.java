import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrintStringTest {

	

		@Test
		void test1() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("aAbbBa");
			assertEquals("bbBa",test);
		}

		@Test
		void test2() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("acb");
			assertEquals("cb",test);
		}
	

		@Test
		void test3() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("adag");
			assertEquals("dag",test);
		}
		
		@Test
		void test4() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("aA");
			assertEquals("",test);
		}
		
		
		@Test
		void test5() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("abA");
			assertEquals("bA",test);
		}
		
		@Test
		void test6() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("aaa");
			assertEquals("a",test);
		}
		
		@Test
		void test7() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("Ba");
			assertEquals("Ba",test);
		}
		
		@Test
		void test8() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("aAbBa");
			assertEquals("bBa",test);
		}
		
		@Test
		void test9() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("ab");
			assertEquals("b",test);
		}
		
		@Test
		void test10() {
			PrintString ps1=new PrintString();
			String test=ps1.TrimEdges("aaca");
			assertEquals("ca",test);
		}
		
}
