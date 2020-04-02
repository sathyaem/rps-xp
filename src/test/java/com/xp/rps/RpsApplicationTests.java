package com.xp.rps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RpsApplicationTests {

	@Test
	void testRockVsScissor() {

		assertEquals(Results.P1_WIN, RPS.play(Throw.ROCK, Throw.SCISSOR));
	}

	@Test
	void testScissorVsRock() {
		assertEquals(Results.P2_WIN, RPS.play(Throw.SCISSOR, Throw.ROCK));
	}

	@Test
	void testScissorVsPaper () {
		assertEquals(Results.P1_WIN, RPS.play(Throw.SCISSOR, Throw.PAPER));
	}

	@Test
	void testPaperVsScissor () {
		assertEquals(Results.P2_WIN, RPS.play(Throw.PAPER, Throw.SCISSOR));
	}

	@Test
	void testPaperVsRock () {
		assertEquals(Results.P1_WIN, RPS.play(Throw.PAPER, Throw.ROCK));
	}

	@Test
	void testRockVsPaper () {
		assertEquals(Results.P2_WIN, RPS.play(Throw.ROCK, Throw.PAPER));
	}

	@Test
	void testRockVsRock () {
		assertEquals(Results.DRAW, RPS.play(Throw.ROCK, Throw.ROCK));
	}

	@Test
	void testScissorVsScissor () {
		assertEquals(Results.DRAW, RPS.play(Throw.SCISSOR, Throw.SCISSOR));
	}

	@Test
	void testPaperVsPaper () {
		assertEquals(Results.DRAW, RPS.play(Throw.PAPER, Throw.PAPER));
	}



	@Test
	void test2PaperVsPaper () {
		assertEquals(Results.DRAW, RPS.play2(Throw.PAPER, Throw.PAPER));
	}
}
