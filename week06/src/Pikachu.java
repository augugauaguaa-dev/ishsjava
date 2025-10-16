public class Pikachu extends Pokemon {
    public Pikachu(int hp, int attackPower){
        super("피카츄", hp, attackPower);
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(name + " -> " + target.getName() + "에게 '전기충격'!");
    }
}


