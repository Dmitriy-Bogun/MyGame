package Logic.Mechanics;

public class Damage  {

        private int damage;
        private boolean critical;

    public boolean isCritical() {
        return critical;
    }

    public Damage(int damage, boolean critical) {
            this.damage = damage;
            this.critical = critical;
        }

        public int getDamage(){
            return damage;
        }


}

