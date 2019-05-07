package Game;

import java.util.Random;

public class Human {
    Random rnd = new Random();
    int hp = 100;
    int damage= rnd.nextInt(100);
    String name = "Ярик";
    
     public String getMonster1() {
        return name;
    }

    public void setName(String[] genres) {
        this.name = name;
    }
    
    
    
    public int gethp() {
        return hp;
    }

    public void sethp(String[] genres) {
        this.hp = hp;
    }
    
    public int getDmg() {
        return damage;
    }

    public void setDmg(String[] genres) {
        this.damage = damage;
    }
    
    
}

