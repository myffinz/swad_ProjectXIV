package projectmaster;

public class Move implements MoveInterface {
    protected Type move;
    protected int baseDamage;
    protected String name;
    protected int MPCost;

    public Move(Type move, int baseDamage, int MPCost, String name){
        if(baseDamage < 0)
            throw new IllegalArgumentException("Base Damage must have a value higher than 0");
        else if(name.equals(""))
            throw new IllegalArgumentException("Name can't be empty");
        this.move = move;
        this.baseDamage = baseDamage;
        this.name = name;
        this.MPCost = MPCost;
    }
    @Override
    public Type getType(){
        return this.move;
    }
    public int getBaseDamage(){
        return this.baseDamage;
    }
    public String getMoveName(){
        return this.name;
    } 
    public int getMPCost(){
        return this.MPCost;
    } 
    // public boolean isMagic(Type move){
    //     return (move==Type.MAGICAL_DMG) ? true : false;
    // }
    // public boolean isHeal(Type move){
    //     return (move==Type.HEAL) ? true : false;
    // }
    // public boolean isATKBuff(Type move){
    //     return (move==Type.ATK_BUFF) ? true : false;
    // }
}
