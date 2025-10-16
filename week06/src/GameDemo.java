public class GameDemo {
    public static void main(String[] args) {
        Pikachu p1 = new Pikachu(100, 27);
        Pikachu p2 = new Pikachu(100, 28);
        Squirtle s1 = new Squirtle(120, 21);

        System.out.println("배틀 시작!");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println("===============");

        int turn = 1;

        while (!p1.isFained() && !s1.isFained()){
            System.out.println("턴 " + turn + " 시작.");
            p1.attack(s1);

            if(s1.isFained()){
                System.out.println(s1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
            }

            s1.attack(p1);

            if(p1.isFained()){
                System.out.println(p1.getName() + "이(가) 기절했습니다! " + s1.getName() + " 승리!");
            }

            turn++;
        }

//        Pikachu mypikachu = new Pikachu(100, 27);
//        Pikachu yourpikachu = new Pikachu(100, 28);
//        Squirtle enemysquirtle = new Squirtle(120, 21);
//        System.out.println("Game Start~");
//        mypikachu.attack(enemysquirtle);
//
//        for (int i=0; i<5; i++)
//            enemysquirtle.attack(mypikachu);
//
//        System.out.println(enemysquirtle);
//        System.out.println(mypikachu);
    }
}
