/**
 * 
 */
package com.learnjava.datatypesdemo.models;

import com.learnjava.datatypesdemo.common.ILightSpeedCalculator;

/**
 * @author Viswanatha Swamy
 *
 */
public class LightSpeedCalculator implements ILightSpeedCalculator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.learnjava.datatypesdemo.common.ILightSpeedCalculator#calculateDistance(
	 * int)
	 */
	@Override
	public long calculateDistance(int numberOfDays) {
		// TODO Auto-generated method stub
		return SPEED * this.getSeconds(numberOfDays);
	}

}
