import java.util.Random;

public class Player extends Parametrs{

    public Player(int hp, int damage, double movement_speed, int resistance) {
        this.hp = hp;
        this.damage = damage;
        this.movement_speed = movement_speed;
        this.resistance = resistance;
    }


    protected int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    protected int getDamage() {
        return damage;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected double getMovement_speed() {
        return movement_speed;
    }

    protected void setMovement_speed(double movement_speed) {
        this.movement_speed = movement_speed;
    }

    protected int getResistance() {
        return resistance;
    }

    protected void setResistance(int resistance) {
        this.resistance = resistance;
    }




    }
