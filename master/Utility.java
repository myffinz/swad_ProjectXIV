package projectmaster;

public class Utility{
    protected static Move PLD_BLADE_OF_VALOR = new Move(Type.PHYSICAL_DMG, 50, 0, "Blade of Valor");
    protected static Move PLD_BLADE_OF_FAITH = new Move(Type.PHYSICAL_DMG, 90,0, "Blade of Faith");
    protected static Move PLD_HOLYSHIELD = new Move(Type.DEF_BUFF, 20, 1000, "Holy Sheltro");
    protected static Move PLD_HOLY_CIRCLE = new Move(Type.HEAL, 20, 5000, "Holy Circle");
    //protected static Move WAR_BLADE_OF_VALOR = new Move(Type.PHYSICAL_DMG, 50, 0, "Blade of Valor");
    //protected static Move WAR_BLADE_OF_FAITH = new Move(Type.PHYSICAL_DMG, 90,0, "Blade of Faith");
    // static Move WAR_HOLYSHIELD = new Move(Type.DEF_BUFF, 20, 1000, "Holy Sheltro");
    //protected static Move WAR_HOLY_CIRCLE = new Move(Type.HEAL, 20, 5000, "Holy Circle");
    protected static Move WHM_GLARE = new Move(Type.MAGICAL_DMG, 80, 400, "Glare");
    protected static Move WHM_HOLY = new Move(Type.MAGICAL_DMG, 90, 600, "Holy");
    protected static Move WHM_TEMPERANCE = new Move(Type.ATK_BUFF, 75, 0, "Temperance");
    protected static Move WHM_SOLACE = new Move(Type.HEAL, 75, 1000,"Afflatus Solace");
    protected static Move NIN_HAKKE_MUJINSATSU = new Move(Type.PHYSICAL_DMG, 65,0, "Hakke Mujinsatsu");
    protected static Move NIN_HYOSHO_RANRYU = new Move(Type.MAGICAL_DMG, 80,0, "Hyosho Ranryu");
    protected static Move NIN_GOKA_MEKKYAKU = new Move(Type.MAGICAL_DMG, 90,0, "Goka Mekkyaku");
    protected static Move NIN_BUNSHIN = new Move(Type.ATK_BUFF, 100,0, "Bunshin Kamaitachi");
    protected static Move SAM_HIGANBANA = new Move(Type.PHYSICAL_DMG, 60,0, "Higanbana");
    protected static Move SAM_TENKA_GOKEN = new Move(Type.PHYSICAL_DMG, 75,0, "Tenka Goken");
    protected static Move SAM_MIDARE_SETSUGEKKA= new Move(Type.PHYSICAL_DMG, 120,1500, "	Kaeshi: Setsugekka");
    protected static Move SAM_NAMIKIRI = new Move(Type.PHYSICAL_DMG, 300,3000, "Kaeshi: Namikiri");
    protected static Move BLM_DESPAIR = new Move(Type.MAGICAL_DMG, 130, 4000, "Despair");
    protected static Move BLM_FLARE = new Move(Type.MAGICAL_DMG, 85, 2000, "Flare");
    protected static Move BLM_XENOGLOSSY = new Move(Type.MAGICAL_DMG, 200, 6000,"Xenoglossy");
    protected static Move BLM_LEYLINES = new Move(Type.ATK_BUFF, 50, 0, "Ley Lines");
    protected static Move SMN_ASTRAL_FLRE = new Move(Type.MAGICAL_DMG, 60, 1000, "Astral Flare");
    protected static Move SMN_BAHAMUT = new Move(Type.MAGICAL_DMG, 0, 3000, "Summon Bahamut");
    protected static Move SMN_CRIM_STRKE = new Move(Type.MAGICAL_DMG, 150, 5000,"Crimson Strike");
    protected static Move SMN_AKH_MORN = new Move(Type.MAGICAL_DMG, 200, 0, "Akh Morn");



    protected static final PlayerPartyInterface[] ALL_CLASSES = {
        new PlayerPartyEntity("Paladin",new Move[] {PLD_BLADE_OF_VALOR,PLD_BLADE_OF_FAITH, PLD_HOLYSHIELD, PLD_HOLY_CIRCLE}, 773 , 137, 373, 40),
        //new PlayerPartyEntity("Warrior",new Move[] {PLD_BLADE_OF_VALOR,PLD_BLADE_OF_FAITH, PLD_HOLYSHIELD, PLD_HOLY_CIRCLE}, 300 , 137, 273, 40),
        new PlayerPartyEntity("White Mage",new Move[] {WHM_GLARE,WHM_HOLY,WHM_TEMPERANCE,WHM_SOLACE}, 381 , 410, 157, 50),
        //new PlayerPartyEntity("Astrologian",new Move[] {AST_XXX,AST_XXX,AST_XXX, AST_XXX}, 375 , 380, 163, 55),
        //new PlayerPartyEntity("Sage",new Move[] {SGE_XXX,SGE_XXX,SGE_XXX, SGE_XXX}, 360 , 430, 130, 62),
        //new PlayerPartyEntity("Dragoon",new Move[] {DRG_XXX,DRG_XXX,DRG_XXX, DRG_XXX}, 510, 330, 195,80),
        new PlayerPartyEntity("Ninja",new Move[] {NIN_HAKKE_MUJINSATSU, NIN_HYOSHO_RANRYU, NIN_GOKA_MEKKYAKU, NIN_BUNSHIN}, 435 , 326, 171,90),
        new PlayerPartyEntity("Samurai",new Move[] {SAM_HIGANBANA, SAM_TENKA_GOKEN, SAM_MIDARE_SETSUGEKKA, SAM_NAMIKIRI}, 487 , 340, 195,70),
        new PlayerPartyEntity("Black Mage",new Move[] {BLM_DESPAIR,BLM_FLARE,BLM_XENOGLOSSY, BLM_LEYLINES}, 317 , 539, 129, 40),
        new PlayerPartyEntity("Summoner",new Move[] {SMN_ASTRAL_FLRE,SMN_BAHAMUT,SMN_CRIM_STRKE, SMN_AKH_MORN}, 349 , 487, 146, 45),
        //new PlayerPartyEntity("Red Mage",new Move[] {RDM_XXX,RDM_XXX,RDM_XXX, RDM_XXX}, 380 , 458, 160, 55)                                
    };

    protected static final MobEntityInterface[] ALL_MOBS = {
        new PlayerPartyEntity("Imperial Legatus",new Move[] {PLD_BLADE_OF_VALOR,PLD_BLADE_OF_FAITH, PLD_HOLYSHIELD, PLD_HOLY_CIRCLE}, 513 , 37, 173, 40),
        //new PlayerPartyEntity("Warrior",new Move[] {PLD_BLADE_OF_VALOR,PLD_BLADE_OF_FAITH, PLD_HOLYSHIELD, PLD_HOLY_CIRCLE}, 300 , 137, 273, 40),
        new PlayerPartyEntity("Imperial Conjiflex",new Move[] {WHM_GLARE,WHM_HOLY,WHM_TEMPERANCE,WHM_SOLACE}, 281 , 310, 157, 50),
        //new PlayerPartyEntity("Astrologian",new Move[] {AST_XXX,AST_XXX,AST_XXX, AST_XXX}, 375 , 380, 163, 55),
        //new PlayerPartyEntity("Sage",new Move[] {SGE_XXX,SGE_XXX,SGE_XXX, SGE_XXX}, 360 , 430, 130, 62),
        //new PlayerPartyEntity("Dragoon",new Move[] {DRG_XXX,DRG_XXX,DRG_XXX, DRG_XXX}, 510, 330, 195,80),
        new PlayerPartyEntity("Imperial Shinobi",new Move[] {NIN_HAKKE_MUJINSATSU, NIN_HYOSHO_RANRYU, NIN_GOKA_MEKKYAKU, SAM_TENKA_GOKEN}, 335 , 226, 131, 80),
        new PlayerPartyEntity("Imperial Gunnin",new Move[] {NIN_HAKKE_MUJINSATSU, SAM_TENKA_GOKEN, SAM_MIDARE_SETSUGEKKA, SAM_NAMIKIRI}, 387 , 240, 155, 60),
        new PlayerPartyEntity("Imperial Signaler",new Move[] {BLM_DESPAIR,BLM_FLARE,SMN_ASTRAL_FLRE, SMN_CRIM_STRKE}, 217 , 339, 50, 40),
        //new PlayerPartyEntity("Summoner",new Move[] {SMN_ASTRAL_FLRE,SMN_BAHAMUT,SMN_CRIM_STRKE, SMN_AKH_MORN}, 349 , 487, 146, 45),
        //new PlayerPartyEntity("Red Mage",new Move[] {RDM_XXX,RDM_XXX,RDM_XXX, RDM_XXX}, 380 , 458, 160, 55)                                
    };
}
