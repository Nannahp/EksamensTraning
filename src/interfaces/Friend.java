package interfaces;

public class Friend implements  Comparable<Friend>{
    private String name;
    private int id;

    public Friend(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Friend o) {
        return o.getId()-this.getId();
    }
}
