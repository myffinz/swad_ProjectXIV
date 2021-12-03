package projectmaster;

public class EntityMob extends AbstractPlayerParty{
    public EntityMob (String name,PlayerPartyInterface[] mobs){
        super(name,mobs);
    }
    @Override
    public Move selectMove(PlayerPartyInterface p){
        return p.getMove(0);
    }
}