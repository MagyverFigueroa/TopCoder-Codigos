public class CardCount {
   public String[] dealHands(int numPlayers, String deck) {
	   String arreglo[]= new String[numPlayers];
	   String arreglo2[]= new String[numPlayers];

	   for(int j=0;j<numPlayers;j++){
			arreglo[j]="";
			arreglo2[j]="";
		}
		while(deck.length()!=0){
			try {

			for(int i=0;i<numPlayers;i++){
				arreglo[i]+=deck.charAt(i)+"";
				
			}
			deck= deck.substring(numPlayers,deck.length());
			
			}
			catch(Exception e){
				for(int j=0;j<numPlayers-1;j++){
					if(arreglo[j].length()<arreglo[j+1].length())return arreglo2;
					}
				}
			}
		
		
		return arreglo;
		
   }

   
  
  

}



// Powered by FileEdit
// Powered by moj 4.17 [modified TZTester]
// Powered by CodeProcessor
