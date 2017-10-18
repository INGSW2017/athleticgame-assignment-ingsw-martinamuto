package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	static AthleticGame ag = new AthleticGame("sci");

	@Test
	public void addArrivalTest() {
		ag.addArrival("Luca", Instant.now());
		Assert.assertEquals(1, ag.getArrivals().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPartecipiantTest() {
		ag.getParecipiantTime("Paolo");

	}
}
