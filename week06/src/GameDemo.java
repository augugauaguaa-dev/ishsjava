public class GameDemo {
    public static void main(String[] args) {
        Pikachu mypikachu = new Pikachu(100);
        Pikachu yourpikachu = new Pikachu(100);
        System.out.println("Game Start~");
        mypikachu.attack(yourpikachu);

        Squirtle mysquirtle = new Squirtle(100);
        Squirtle yoursquirtle = new Squirtle(100);
        System.out.println("Game Start~");
        mysquirtle.attack(yoursquirtle);
    }
}
