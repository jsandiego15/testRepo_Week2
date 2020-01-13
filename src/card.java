
/**
 *
 * @author james
 */
public class card {
    private String suit;
    private int value;
}

public String getSuit(){
return suit;
}

public void setSuit(String suit){

    if(suit.equals("Spade"||suit.quals("diamonds")||
            suit.equals("clubs")||suit.equals("Hearts"))
            this.suit = suit;
else{
    System.out.println("Incorrect suit. Please enter a valid suit");
}

public int getValue() {
    return value;
}
    
}
