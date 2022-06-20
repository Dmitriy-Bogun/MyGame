package Logic.Mechanics;

import Logic.Entities.Skill.Skill;

import java.util.List;
import java.util.Random;

public class Damage  {
    Random random;
    Skill skill;
    List <Skill> skillsList;
        private int damage;

        public Damage(int damage) {
            this.damage = damage;
        }

        public int getFinalDamage(){
            return damage;
        }


}

