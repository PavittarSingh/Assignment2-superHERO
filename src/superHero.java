/**
 * @author: Pavittar Singh
 * @version: 2015/02/05
 * @assignment: 2nd Super Hero
 * @purpose:  This is the Subclass of Hero Class.This Class designed to Extends the Hero Class to display the Powers of the Hero. 
 * 
 */

    import java.util.ArrayList; 
    import java.util.Arrays;

    // Declear the superhero class

    public class superHero extends Hero {
	// Define Constructor
	private String[] Powers = new String [3];
	public superHero(String name)
	
	{
		super(name);
	 
		generateRandomPowers();	
    }	
	

    // This Method created to adds the powers to ArrayList Powers then add to superpower arrays 

	
    private void generateRandomPowers(){
		
		//create instanced variables
		    ArrayList<String> powerList = new ArrayList<String>();				
			powerList.addAll(Arrays.asList
					         ("Super Speed",
							  "Super Strength", 
							  "Body Armor",
							  "Flight",
							  "Fire Generation", 
							  "Weather Control"));		
		
	//loop used for random powers from array list
		int loop;
		
		for(int i = 0; i <=2; i++){
			 loop = (int)(Math.random() * powerList.size());
			 this.Powers[i] = powerList.get(loop);
			 powerList.remove(loop);
		}
		
    }
	// Show Method used to show the loop's value. 
	public void showPower(){
		
		System.out.println(this.name + " has super powers: ");		 
		for(int i = 0; i < Powers.length; i++)
		{
			System.out.println(Powers[i]);
		} 
		
	}
	
}
	
