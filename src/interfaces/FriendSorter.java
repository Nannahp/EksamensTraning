package interfaces;

import java.util.Comparator;

public class FriendSorter implements Comparator<Friend> {
    @Override
    public int compare(Friend o1, Friend o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
