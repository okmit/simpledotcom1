public class SimpleDotComGame {
	public static void main(String [] args){
		//System.out.println("Start Game");
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();		
		int randomNum = (int) (Math.random() * 5);
		
		int [] locations = {randomNum, randomNum + 1, randomNum + 2};	
		theDotCom.setLocationCells(locations);		
		boolean isAlive = true;
		
		System.out.println(randomNum);
		
		//mojna prosto isAlive 
		while(isAlive == true){
			String guess = helper.getUserInput("Enter number");
			String result = theDotCom.checkYourself(guess);
			
			numOfGuesses++;
			
			if(result.equals("Down")){
				isAlive = false;
				
				System.out.println("You need " + numOfGuesses + " shots");
			}
		}
	}
}
