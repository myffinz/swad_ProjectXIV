package projectmaster;

public class Move implements MoveInterface {
    protected Type type;
    protected int baseDamage;
    protected String name;
    //protected int M

    public Move(Type type, int baseDamage, int MPCost, String name){
        if(baseDamage < 0)
            throw new IllegalArgumentException("Base Damage must have a value higher than 0");
        else if(name.equals(""))
            throw new IllegalArgumentException("Name can't be empty");
        this.type = type;
        this.baseDamage = baseDamage;
        this.name = name;
        //this.MPCost = MPCost;
    }
    @Override
    public Type getType(){
        return this.type;
    }
    public int getBaseDamage(){
        return this.baseDamage;
    }
    public String getMoveName(){
        return this.name;
    }
}
