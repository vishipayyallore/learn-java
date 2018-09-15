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
	public void lightSpeedCalculatorShouldReturnValid() {
		long distanceTravelled = lightSpeedCalculator.calculateDistance(0);
		
		assertThat(distanceTravelled, is(not(0)));
	}

}
