/*******************
  Name: Benny A. Fields III

  Date: 12 March 2018

  Notes: This program creates an array of four random
         int numbers between the range of 0 and 100. The
         printout will display the random lotto number 
         assigned to which variable. 
*******************/

public class LottoWinner {

   public static void main(String[] args) {
 
      //Create array named lottoNumbers and giving it a index number of 4 places
      int[]lottoNumbers = new int[4];
      int a=0;    //Assigning variable a to equal zero
 
      while (a < 4){
  
      //Assigning n to be a random number that does not have decimals
      int n = (int) Math.ceil(Math.random() * 99);  
 
         if(lottoNumbers[0] == 0) {        //Check to see if first index is 0
            lottoNumbers[0] = n;           //If so, assign random number n to index 0
         } 
         else if (lottoNumbers[1] == 0) {  //Check to see if second index is 0
            lottoNumbers[1]= n;            //If so, assign random number n to index 1
         }
         else if(lottoNumbers[2] == 0) {   //Check to see if third index is 0
            lottoNumbers[2]= n;            //If so, assign random number n to index 2    
         }
         else if(lottoNumbers[3] == 0) {   //Check to see if fourth index is 0
            lottoNumbers[3]= n;            //If so, assign random number n to index 3
         }
         a++;     //This adds 1 to a during the while loop
       }
            System.out.println("Winning Numbers are: ");  
    
         for(int i = 0; i < 4; i++){
            System.out.println("Lotto number assigned to index " + i + " is " + lottoNumbers[i]);
         }
   }   
}
