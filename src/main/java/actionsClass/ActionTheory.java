package actionsClass;

public class ActionTheory {

	/*Note - Without perform() actions method won't work .perform() is mandatory
	 *        .build().perform()     OR  .perform  both will work
	 *1.Action class all user related actions available in this class include key board also 
	 * 2.SELENIUM is having own mouse mover it does not move the windows cursor. Don't move own cursor
	 * 3.Right Context click example =  http://swisnl.github.io/jQuery-contextMenu/demo.html
	 * 4.Bottom of the page scrolling = www.freshworks.com
	 * 
	 * 
	 *  Difference between Actions and Action ?
	 *
	 * What is Actions ?
	 * Actions is a class having lot of static method
	 *
	 * Q. What is the return type of build()
	 * Answer Return type is Action and its is an interface
	 * 
	 * What is build() ?
	 * build() is a composite action arrange in a same sequence. it can use whenever user perform 
	 * more than 1 actions. Till SELENIUM-3 its mandatory to use but from SELENIUM-4 itS not mandatory.
	 * 
	 *  .build---NO          --- it does not work
	 *  .perform-- Yes       ----this will work
	 *  .build.perform -- yes----this also works
	 *  
	 *   
	 *   
		//how many ways user can do sendKeys operation 
		//1. WebElement SendKeys
		//2. Actions SendKeys
		//3. JavaScript Executor 
		
		//Click operation
		//1. WE Click
		//2. Actions Click
		//3. JavaScript Executor Click
	 * 
	 * 
	 * 
	 */

}
