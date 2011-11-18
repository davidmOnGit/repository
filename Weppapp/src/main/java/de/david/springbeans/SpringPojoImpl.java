package de.david.springbeans;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SpringPojoImpl implements SpringPojo{
	
	
	@Override
	public void doNothing(){
		Logger.getLogger("SpringPojoLogger").log(Level.INFO, "Deine Springbean hat was geloggt!");
	}
	

}
