package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
//        System.out.println(fruits.isEmpty());

        fruits.add(new Fruit("Kiwi", 3000));
        fruits.add(new Fruit("Strawberry", 2500));

//        Fruit[] fruits = {
//                new Fruit("Kiwi", 3000),
//                new Fruit("Strawberry", 2500)
//        };
//
//        for(Fruit fruit : fruits){
//            System.out.println(fruit.getName() + "(단가:" + fruit.getPrice() + ")");
//        }
//
        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i).getName() + "(단가:" + fruits.get(i).getPrice() + ")");
        }
//
//        Fruit fruit1 = new Fruit("Kiwi", 3000);
//        Fruit fruit2 = new Fruit("Strawberry", 2500);
//        System.out.println(fruit1.getName() + "(단가:" + fruit1.getPrice + ")");

    }
}
