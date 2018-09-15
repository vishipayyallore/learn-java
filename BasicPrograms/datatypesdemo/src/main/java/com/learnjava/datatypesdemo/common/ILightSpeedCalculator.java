/**
 * 
 */
package com.learnjava.datatypesdemo.common;

/**
 * @author Viswanatha Swamy
 *
 */
public interface ILightSpeedCalculator {

	// Constants
	int SPEED = 1_86_000;
	long SECONDS = 24 * 60 * 60;

	long calculateDistance(int numberOfDays);

	default long getSeconds(int numberOfDays) {
		return numberOfDays * SECONDS;
	}
}
