package Game;

import java.util.Random;

public class Monster1 {
    Random rnd = new Random();
    int hpM1 = 100;
    int damageM1= rnd.nextInt(100);
    String name = "Первый Босс";
    
     public String getMonster1() {
        return name;
    }

    public void setMonster1(String[] genres) {
        this.name = name;
    }
    
    
    
    public int getM1hp() {
        return hpM1;
    }

    public void setM1hp(String[] genres) {
        this.hpM1 = hpM1;
    }
    
    public int getDmgM1() {
        return damageM1;
    }

    public void setDmgM1(String[] genres) {
        this.damageM1 = damageM1;
    }
    
    
}

