public abstract class Pokemon {
    protected String name;
    private int hp;
    private int attackPower;

    public Pokemon(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }

    public abstract void attack(Pokemon target);

    @Override
    public String toString() {
        return name + " (HP : " + hp + ", AttackPower : " + attackPower + ")";
    }
}
