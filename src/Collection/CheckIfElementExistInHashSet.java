package Collection;

import java.util.HashSet;

public class CheckIfElementExistInHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet hs=new HashSet();
      
      hs.add("running");
      hs.add("gym");
      hs.add("calasthenic");
      hs.add("game");
      
      if(hs.contains("gym"))
      {
    	  System.out.println("Today you need to go to Gym");
      }
      else
      {
    	  System.out.println("you do not go to gym");
      }
	}

}
