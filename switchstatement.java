
public class switchstatement {

	public static void main(String[] args) {
   int day = 3;
   
   switch (day ) {  /* when using switch we indicate the key, that is the value in this case would be the variable day*/
   case 1:  /* inside case we define conditions case goes inside the body of switch*/
  System.out.println("Today is MOnday ");
  break;									/* we use breaks otherwise it will print the following switch conditions one after another*/
   case 2:
	   System.out.println("TOday is Tuesday ");
	   break;
   case 3:
	   System.out.println("TOday is Wednesday");
	   break;
   case 4: 
   System.out.println("Today is Thursday ");
   break;
   
   case 5 :
	   System.out.println("Today is Friday ");
	   break;
   default:
	   System.out.println("Hey! It is weekend :) !!!");
	   break;   
   
   } 
	}

}
