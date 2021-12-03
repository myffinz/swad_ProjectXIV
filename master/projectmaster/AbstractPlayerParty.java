package projectmaster;

public abstract class AbstractPlayerParty implements PlayerInterface{
    protected PlayerPartyInterface [] entityPlayer;
    protected PlayerPartyInterface currentPartyMember;
    protected String name;

    public AbstractPlayerParty(String name, PlayerPartyInterface[] partyMember){
        if(partyMember == null)
            throw new IllegalArgumentException("A Light Party must have at least 1 Player alive\n");
        else if (partyMember.length > NUM_MAX_PLAYERS)
            throw new IllegalArgumentException("A Party can only have a team of 4 Players\n");
        this.name = name;
        this.entityPlayer = partyMember;
        this.currentPartyMember = partyMember[0];
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public PlayerPartyInterface getCurrentPartyMember() {
        return this.currentPartyMember;
    }
    @Override
    public boolean switchPartyMember() {
        if(this.currentPartyMember.checkDeadStatus()&&!this.isDefeated()){
            for(int i = 0; i<entityPlayer.length;i++){
                if(!entityPlayer[i].checkDeadStatus()){
                    this.currentPartyMember = this.entityPlayer[i];
                    break;
                } 
            }
            return true;            
        }
        return false;
    }
    @Override
    public boolean isDefeated() {
        for (PlayerPartyInterface p : entityPlayer) {
            if (!p.checkDeadStatus()) {
                return false;
            }
        }
        return true;
    }
    @Override
    public PlayerPartyInterface getPlayerParty(int i) {
        return this.entityPlayer[i];
    }
    @Override
    public int getNumAlivePlayers() {
        int check = 0;
        for (int i = 0; i < this.entityPlayer.length; i++) {
            if (!this.entityPlayer[i].checkDeadStatus()){
                check++;
            }
        }
        return check;
    }
    public abstract Move selectMove(PlayerPartyInterface p);
}
