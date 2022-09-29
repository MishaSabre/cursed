import java.io.Serializable;

public class Swordsman extends Human implements Serializable{

    private int armor;

    public Swordsman(){ countEntity++;}

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Swordsman obj = (Swordsman) o;
        return this.getAlive() == obj.getAlive() && this.getHeartPoint() == obj.getHeartPoint()
                && this.getDamage() == obj.getDamage() && this.getName() == obj.getName() && this.getTeam() == obj.getTeam()
                && this.getArmor() ==  obj.getArmor();
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        result += this.getAlive() ? 1 : 0;
        result += this.getTeam() == null ? 0 : this.getTeam().hashCode();
        result = 31 * result + this.getHeartPoint();
        result = 31 * result + this.getDamage();
        result = 31 * result + this.getArmor();
        return result;
    }

    @Override
    public String toString() {
        return  this.getName()  + " Damage = " + this.getDamage()  + " Is alive = " + this.getAlive() +  " Heartpoint = " +
                this.getHeartPoint() + " Team = " + this.getTeam() + " Armor = " + this.getArmor() ;
    }
}

