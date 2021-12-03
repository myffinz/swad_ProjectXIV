package projectmaster;

public class Utility{
    protected static Move PLD_BLADE_OF_VALOR = new Move(Type.PHYSICAL_DMG, 50, 0, "Blade of Valor");
    protected static Move PLD_BLADE_OF_FAITH = new Move(Type.PHYSICAL_DMG, 90,0, "Blade of Faith");
    protected static Move PLD_HOLYSHIELD = new Move(Type.DEF_BUFF, 20, 1000, "Holy Sheltro");
    protected static Move PLD_HOLY_CIRCLE = new Move(Type.HEAL, 20, 5000, "Holy Circle");
    protected static Move WHM_GLARE = new Move(Type.MAGICAL_DMG, 80, 400, "Glare");
    protected static Move WHM_HOLY = new Move(Type.MAGICAL_DMG, 90, 600, "Holy");
    protected static Move WHM_TEMPERANCE = new Move(Type.ATK_BUFF, 75, 0, "Temperance");
    protected static Move WHM_SOLACE = new Move(Type.HEAL, 75, 1000,"Afflatus Solace");
    protected static Move NIN_HAKKE_MUJINSATSU = new Move(Type.PHYSICAL_DMG, 65,0, "Hakke Mujinsatsu");
    protected static Move NIN_HYOSHO_RANRYU = new Move(Type.MAGICAL_DMG, 80,0, "Hyosho Ranryu");
    protected static Move NIN_GOKA_MEKKYAKU = new Move(Type.MAGICAL_DMG, 90,0, "Goka Mekkyaku");
    protected static Move NIN_BUNSHIN = new Move(Type.ATK_BUFF, 100,0, "Bunshin Kamaitachi");
    protected static Move BLM_DESPAIR = new Move(Type.MAGICAL_DMG, 130, 4000, "Despair");
    protected static Move BLM_FLARE = new Move(Type.MAGICAL_DMG, 85, 2000, "Flare");
    protected static Move BLM_XENOGLOSSY = new Move(Type.MAGICAL_DMG, 200, 6000,"Xenoglossy");
    protected static Move BLM_LEYLINES = new Move(Type.ATK_BUFF, 50, 0, "Ley Lines");



    protected static final PlayerPartyInterface[] ALL_CLASSES = {
        new PlayerPartyEntity("Paladin",new Move[] {PLD_BLADE_OF_VALOR,PLD_BLADE_OF_FAITH, PLD_HOLYSHIELD, PLD_HOLY_CIRCLE}, 300 , 137, 273, 40),
        new PlayerPartyEntity("White Mage",new Move[] {WHM_GLARE,WHM_HOLY,WHM_TEMPERANCE,WHM_SOLACE}, 171 , 210, 157, 50),
        new PlayerPartyEntity("Ninja",new Move[] {NIN_HAKKE_MUJINSATSU, NIN_HYOSHO_RANRYU, NIN_GOKA_MEKKYAKU, NIN_BUNSHIN}, 200 , 326, 171,80),
        new PlayerPartyEntity("Black Mage",new Move[] {BLM_DESPAIR,BLM_FLARE,BLM_XENOGLOSSY, BLM_LEYLINES}, 150 , 539, 100, 35)
        //new Pokemon("Banette",new Move[] {SHADOWBALL,ENERGYBALL}, 238 , 235, 135, 135),                           
    };
}
