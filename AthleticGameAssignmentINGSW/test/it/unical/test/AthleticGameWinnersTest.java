package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;


public class AthleticGameWinnersTest {
static AthleticGame ag;

@BeforeClass
public static void init(){
	ag=new AthleticGame("sci");
}

@Before
public void startTest(){
	ag.start();
}

@After
public void resetTest(){
	ag.reset();
}

@Test
public void getWinnerTest1(){
	//ag.addArrival("Mario", Instant.now());
	Assert.assertEquals("Mario",ag.getWinner());
}

@Test
public void getWinnerTest2(){
	Assert.assertEquals(null,ag.getWinner());
}

}
