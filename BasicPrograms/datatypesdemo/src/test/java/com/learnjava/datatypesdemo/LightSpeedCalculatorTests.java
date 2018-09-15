/**
 * 
 */
package com.learnjava.datatypesdemo;

import org.junit.Test;
import com.learnjava.datatypesdemo.common.ILightSpeedCalculator;
import com.learnjava.datatypesdemo.models.LightSpeedCalculator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



/**
 * @author Viswanatha Swamy
 *
 */
public class LightSpeedCalculatorTests {

	ILightSpeedCalculator lightSpeedCalculator;
	
	public LightSpeedCalculatorTests() {
		lightSpeedCalculator = new LightSpeedCalculator();
	}

	@Test
	public void lightSpeedCalculatorShouldReturnInValid() {
		int numberOfDays = 0;
		
		long distanceTravelled = lightSpeedCalculator.calculateDistance(numberOfDays);
		
		assertThat(distanceTravelled, is(0L));
	}

	@Test
	public void lightSpeedCalculatorShouldReturnValid() {
		int numberOfDays = 2;
		
		long distanceTravelled = lightSpeedCalculator.calculateDistance(numberOfDays);
		
		assertThat(distanceTravelled, is(not(0L)));
	}

}
