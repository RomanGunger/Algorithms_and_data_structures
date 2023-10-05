package ru.geekbrains.lesson4;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);

        HashMap<String, String> hashMap = new HashMap<>(4);
        hashMap.put("+7900111223300", "AAAAAAA");
        hashMap.put("+7900111223301", "BBBBBBB");
        hashMap.put("+7900111223300", "DDDDDDD");
        hashMap.put("+7900111223302", "EEEEEEE1");
        hashMap.put("+7900111223303", "EEEEEEE2");
        hashMap.put("+7900111223304", "EEEEEEE3");
        hashMap.put("+7900111223305", "EEEEEEE4");
        hashMap.put("+7900111223306", "EEEEEEE5");
        hashMap.put("+7900111223307", "EEEEEEE6");
        hashMap.put("+7900111223308", "EEEEEEE7");
        hashMap.put("+7900111223343", "EEEEEEE8");
        hashMap.put("+7900111223364", "EEEEEEE8");
        hashMap.put("+7900111223312", "DHFDKSW");
        hashMap.put("+7900111223388", "KDFFDWW");


        System.out.println(hashMap);

        System.out.println();

        for (HashMap.Entity entuty : hashMap) {
            if(entuty != null){
                System.out.printf("%s - %s\n", entuty.key, entuty.value);
            }
        }


    }

}
