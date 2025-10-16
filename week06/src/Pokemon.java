public abstract class Pokemon {
    protected String name;
    private int hp;

    public Pokemon(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }

    public abstract void attack(Pokemon target);

}
