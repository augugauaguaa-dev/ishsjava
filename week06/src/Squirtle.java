public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower) {
        super("꼬부기", hp, attackPower);
        System.out.println("꼬북꼬북~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 3;
        System.out.println(name + " -> " + target.getName() + "에게 '물대포'!");
        target.setHp(target.getHp()-damage);
    }
}