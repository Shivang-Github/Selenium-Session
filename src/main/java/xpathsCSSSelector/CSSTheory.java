package xpathsCSSSelector;

import java.lang.Object;

class CSSTheory extends Object {
	
	
	//1. id = #
		//2. class name = .
		//3. contains = ^
		//4. starts-with= ~
		//5. ends-with= $
		//6. parent child= 1 space between them  =parentTag childTag
		//7. Direct parent child relationship =  parent tag>child tag
		//8. Immediate Following sibling = +
		//9. For Iteration option list from child element use = ~
	
		
		//*Drawbacks in CSS
		//1. Backward traversing not allowed in CSS selector
		//2. No Support for text in CSS. that's why WebTable is nightMare with CSS
		
	
       //*Index in CSS   
	    // URL = https://www.orangehrm.com/en/30-day-free-trial
	   //URL=https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20 (TRY THIS URL ALSO)
	
	  //1. select#Form_getForm_Country > option:nth-of-type(1)
	  //2. select#Form_getForm_Country > option:nth-of-type(n)
	
      //3.select#Form_getForm_Country > option:first-child
	  //4.select#Form_getForm_Country > option:last-child
	
	  //5.select#Form_getForm_Country > option:nth-child(200)
	  //6.select#Form_getForm_Country > option:nth-last-child(n) all
	  //7.select#Form_getForm_Country > option:nth-last-child(2) Second last option will select
	
	  //* ODD AND EVEN (IMP FOR Interview)
	
	  //comment) select#Form_getForm_Country > option:nth-last-child(odd)
	  //comment)  select#Form_getForm_Country > option:nth-last-child(even)
	
	 //*odd and even from XPATH also
	 
	//comment) select[@id='input-sort']//option[position() mod 2=0]    //even position //2,4,6,8,10
	//comment) select[@id='input-sort']//option[position() mod 2=1]    //odd postion   //1,3,5,7,9
	
	  //select#input-sort>option:nth-child(n+4)     //it start from 4th option
	
	  //Multiples
	  //comment) select#input-sort>option:nth-child(2n)   // 2,4,6,8,10
	  //comment) select#input-sort>option:nth-child(3n)   // 3,6,9,12
	  //comment) select#input-sort>option:nth-child(4n)   //4,8,12,16
	
	//*Comma in CSS
	//1.  input#input-firstname,#input-lastname,#input-email,#input-telephone  //4 webelment will get it with single css
	//2.  [placeholder='First Name'],[placeholder='Last Name'],[placeholder='E-Mail']
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
