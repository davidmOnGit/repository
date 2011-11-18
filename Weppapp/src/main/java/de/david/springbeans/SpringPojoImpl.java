package de.david.springbeans;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SpringPojoImpl implements SpringPojo{
	
	private String pojoString;
	
	public String getPojoString() {
		return pojoString;
	}

	public void setPojoString(String pojoString) {
		this.pojoString = pojoString;
	}

	@Override
	public void doNothing(){
		Logger.getLogger("SpringPojoLogger").log(Level.INFO, "Deine Springbean hat was geloggt!");
	}
	

}
