package week5.day2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String[] args) {
		String input="babub";
		Set<String> name=new HashSet<String>();
      for(int i=0; i<=input.length()-1; i++) {
    	  name.add(input); //add
    	  System.out.println(input);
    	  System.out.println(input.charAt(i));//convert to char
    	  
    name.remove("b");
    	System.out.println(name);
    	
    	         //another type to remove duplicate
    	//String duplicate=name.toString();
    	// System.out.println(duplicate);
      }
		
		
		
	}

}
