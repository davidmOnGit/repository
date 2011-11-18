/**
 * 
 */
package de.david;

/**
 * @author davidmager
 *
 */
public class UiController {
	private String value;
	private de.david.springbeans.SpringPojo springPojo;
	
	public UiController() {
	}
	
	public String goToMainPage(){
		return "mainPage";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public de.david.springbeans.SpringPojo getSpringPojo() {
		return springPojo;
	}

	public void setSpringPojo(de.david.springbeans.SpringPojo springPojo) {
		this.springPojo = springPojo;
	}
	
	public void pojoValue(){
		getSpringPojo().doNothing();
	}
}
