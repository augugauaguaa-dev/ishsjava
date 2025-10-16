public class GameDemo {
    public static void main(String[] args) {
        Pikachu mypikachu = new Pikachu(100, 27);
        Pikachu yourpikachu = new Pikachu(100, 28);
        Squirtle enemysquirtle = new Squirtle(120, 21);
        System.out.println("Game Start~");
        mypikachu.attack(yourpikachu);
        mypikachu.attack(enemysquirtle);
        enemysquirtle.attack(mypikachu);

        System.out.println(yourpikachu);
        System.out.println(enemysquirtle);
    }
}
