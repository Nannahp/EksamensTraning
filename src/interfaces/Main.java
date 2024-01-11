package interfaces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }
    private int nextId=1;
    private ArrayList<Friend> friends = new ArrayList<>();

    private void run() {
     createFriend("marc");
     createFriend("jan");
     createFriend("lisa");

     for(Friend friend: friends){
         System.out.println(friend.getId());
     }
        System.out.println("-------");

        Collections.sort(friends);
     for(Friend friend: friends){
         System.out.println(friend.getId());
     }
        System.out.println("--------");

     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,59,2, 10, 15));

     Collections.sort(list, Comparator.naturalOrder());

     for(int number: list){
         System.out.println(number);
     }
        System.out.println("-------");

     Collections.sort(friends, new FriendSorter());

     for(Friend friend: friends){
         System.out.println(friend.getName());
     }


    }
    public void updateId(){
        nextId = nextId +1;
    }
    public  void createFriend(String name){
        Friend friend = new Friend(name);
        friend.setId(nextId);
        updateId();
        friends.add(friend);

    }
}
