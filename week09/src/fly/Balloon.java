package fly;

import pokemons.Pokemon;

public class Balloon implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 풍선타고 날아가자");
    }
}
