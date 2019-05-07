package Game;

import java.util.Random;

public class Monster2 {
    Random rnd = new Random();
    int hpM2 = 140;
    int damageM2= rnd.nextInt(100);
    String name = "Второй Босс";
    
    public String getMonster2() {
        return name;
    }

    public void setMonster2(String[] genres) {
        this.name = name;
    }
    
    
    
    public int getM2hp() {
        return hpM2;
    }

    public void setM2hp(String[] genres) {
        this.hpM2 = hpM2;
    }
    
    public int getDmgM2() {
        return damageM2;
    }

    public void setDmgM2(String[] genres) {
        this.damageM2 = damageM2;
    }
}
