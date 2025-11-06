package pokemons;

import fly.Wings;

public class Charizard extends Pokemon {
    public Charizard(int hp, int attackPower, Wings wings){
        super("리자몽", hp, attackPower, wings);
        System.out.println("자몽자몽~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 5;
        System.out.println(name + " -> " + target.getName() + "에게 '불대문자' 사용! (데미지: " + damage + ")");
        target.receiveDamage(damage);
        System.out.println(target.getName() + "의 남은 Hp : " + target.getHp());
    }
}
