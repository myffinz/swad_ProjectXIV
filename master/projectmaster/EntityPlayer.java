package projectmaster;
import java.util.Scanner;

public class EntityPlayer extends AbstractPlayerParty {
    protected Scanner userInput;
    
    public EntityPlayer(String name,PlayerPartyInterface[] party, Scanner userInput){
        super(name,party);
        this.userInput = userInput;
    }

    @Override
    public Move selectMove(PlayerPartyInterface p){
        System.out.print("What skill do you want to use: "+p.movesToString());
        return p.getMove(this.userInput.nextInt());
    }

}