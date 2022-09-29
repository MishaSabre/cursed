import java.io.Serializable;

public class Bowman extends Human implements Serializable{

    public Bowman(){countEntity++;}

    public void shoot(Entity smbd2){
        smbd2.setHeartPoint(smbd2.getHeartPoint() - (this.getDamage() * 2));
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bowman obj = (Bowman) o;
        return this.getAlive() == obj.getAlive() && this.getHeartPoint() == obj.getHeartPoint()
                && this.getDamage() == obj.getDamage() && this.getName() == obj.getName() && this.getTeam() == obj.getTeam();
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        result += this.getAlive() ? 1 : 0;
        result += this.getTeam() == null ? 0 : this.getTeam().hashCode();
        result = 31 * result + this.getHeartPoint();
        result = 31 * result + this.getDamage();

        return result;
    }

    @Override
    public String toString() {
        return  this.getName()  + " Damage = " + this.getDamage()  + " Is alive = " + this.getAlive() +  " Heartpoint = " +
                this.getHeartPoint() + " Team = " + this.getTeam()  ;
    }
}

