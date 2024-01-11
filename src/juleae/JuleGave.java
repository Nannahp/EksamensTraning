package juleae;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;
    private Random random = new Random();

    public JuleGave(){
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle= random.nextBoolean();
    }
    public boolean getIsSoft(){
        return isSoft;
    }

    public  boolean getIsRectangular(){
        return isRectangular;
    }

    public  boolean getDoesRattle(){
        return doesRattle;
    }
    public boolean couldBeLego(){
        if(!isSoft && isRectangular && doesRattle){
            return  true;
        }
        else  return  false;
    }
}
