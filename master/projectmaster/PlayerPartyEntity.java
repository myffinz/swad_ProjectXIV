package projectmaster;

public class PlayerPartyEntity implements PlayerPartyInterface{
    protected String name;
    protected Move[] move;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed; 

    public PlayerPartyEntity(){

    }
    public PlayerPartyEntity(String name, Move[] move, int hp, int attack, int defense, int speed){
        if(hp<=0 || attack < 0 || defense < 0){
            throw new IllegalArgumentException("Invalid value | values can't be below 0");
        }
        else if(move.length != NUM_MOVES)
            throw new IllegalArgumentException("A Class can only have "+NUM_MOVES+" moves!");  
        else if(name.equals(""))
            throw new IllegalArgumentException("Entity Class Name can't be empty");

        this.name = name;
        this.move = move;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
    @Override
    public int getAttackStat(){
        return this.attack;
    }
    public int getDefenseStat(){
        return this.defense;
    }
    public int getHPStat(){
        return this.hp;
    }
    public int getSpeedStat(){
        return this.speed;
    }
    public int takeHit(PlayerPartyInterface p, MoveInterface move){
        int hitDamage = (int)  move.getBaseDamage()*p.getAttackStat()/this.getDefenseStat();
        this.hp -= hitDamage;
        return hitDamage;
    }
    public boolean checkDeadStatus(){
        return (hp <= 0) ? true : false;
    }
    
    public Move getMove(int i){
        return this.move[i];
    }
    public String getName(){
        return this.name;
    }
    public String movesToString(){
        String movesList = "";
        for(int i = 0; i < move.length; i++){
            movesList = movesList.concat("["+i+"] "+move[i].getMoveName()+": ");
        }
        return movesList;
    }
    @Override
    public Move selectAttackMove(PlayerInterface player) {
        return player.selectMove(this);
    }

}