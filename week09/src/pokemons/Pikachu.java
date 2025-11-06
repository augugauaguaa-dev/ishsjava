package pokemons;

import fly.NoFly;

public class Pikachu extends Pokemon {
    public Pikachu(int hp, int attackPower, NoFly noFly){
        super("피카츄", hp, attackPower, noFly); //부모클래스의 생성재 호출
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 5;
        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용! (데미지: " + damage + ")");
        target.receiveDamage(damage);
        System.out.println(target.getName() + "의 남은 Hp : " + target.getHp());
    }
}


