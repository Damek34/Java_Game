import folder2.Weapon;

import java.util.Random;

public class Zadanko {

    public static void main(String[] args) throws InterruptedException {

        Player player = new Player(100, 5, 2, 4);
        Enemy enemy = new Enemy(100, 5, 2, 3);
        Weapon knife = new Weapon("Knife", 5);
        Weapon axe = new Weapon("Axe", 7);
        Weapon saw = new Weapon("Saw", 4);


        int round = 1;
        Random random = new Random();
        int pick;

        int rng_player_armor = random.nextInt(30);
        int rng_enemy_armor = random.nextInt(30);

        boolean player_has_weapon = false;
        boolean enemy_has_weapon = false;


        while(player.getHp() > 0 && enemy.getHp() > 0){
            System.out.println("Round " + round + ":\n");


            pick = random.nextInt(8);

            if(pick == 1 && player_has_weapon == false) {

                System.out.println("Player got " + axe.getName() + "!");
                player.setDamage(player.getDamage() + axe.getDamage());
                player_has_weapon = true;
            }

            if(pick == 2 && player_has_weapon == false) {

                System.out.println("Player got " + knife.getName() + "!");
                player.setDamage(player.getDamage() + knife.getDamage());
                player_has_weapon = true;
            }

            if(rng_enemy_armor %3 == 0){
                enemy.setHp(enemy.getHp() - player.getDamage() + enemy.getResistance());
                System.out.println("Player start attack, but Enemy dodged " + enemy.getResistance() + " damage, dealing " + (player.getDamage() - enemy.getResistance()) + " damage to Enemy!\nNow Enemy have " + enemy.getHp() + "HP!\n");
            }
            else{
                enemy.setHp(enemy.getHp() - player.getDamage());
                System.out.println("Player start attack, dealing " + player.getDamage() + " damage to Enemy!\nNow Enemy have " + enemy.getHp() + "HP!\n");
            }

            Thread.sleep(2000);


            pick = random.nextInt(8);
            if(pick == 1 && enemy_has_weapon == false) {

                System.out.println("Enemy got " + axe.getName() + "!");
                enemy.setDamage(enemy.getDamage() + axe.getDamage());
                enemy_has_weapon = true;
            }

            if(pick == 2 && enemy_has_weapon == false) {

                System.out.println("Enemy got " + knife.getName() + "!");
                enemy.setDamage(enemy.getDamage() + knife.getDamage());
                enemy_has_weapon = true;
            }


            if(rng_player_armor %3 == 0){
                player.setHp(player.getHp() - enemy.getDamage() + player.getResistance());
                System.out.println("Enemy start attack, but Player dodged " + player.getResistance() + " damage, dealing " + (enemy.getDamage() - player.getResistance()) + " damage to Player!\nNow Player have " + player.getHp() + "HP!\n");
            }
            else{
                player.setHp(player.getHp() - enemy.getDamage());
                System.out.println("Enemy start attack, dealing " + enemy.getDamage() + " damage to Player!\nNow Player have " + player.getHp() + "HP!\n");
            }

            Thread.sleep(4000);


            round++;
            rng_enemy_armor++;
            rng_player_armor++;

        }

        if(player.getHp() <= 0){
            System.out.println("Enemy wins!");
        }
        else{
            System.out.println("Player wins!");
        }




    }
}
