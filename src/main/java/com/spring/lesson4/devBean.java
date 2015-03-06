package com.spring.lesson4;

public class devBean implements Bean {	
		
		/* (non-Javadoc)
		 * @see com.spring.lesson4.Bean#aboutBean()
		 */
		public void aboutBean(){
			System.out.println("devBean name" + this.getClass().getName());
		}
	


}
