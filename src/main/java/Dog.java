import java.io.Serializable;

public class Dog extends Beast implements Serializable{

    public Dog(){countEntity++;}

    @Override
    public void voice() {
        System.out.println("Bark-Bark!");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog obj = (Dog) o;
        return this.getAlive() == obj.getAlive() && this.getHeartPoint() == obj.getHeartPoint()
                && this.getDamage() == obj.getDamage() && this.getName() == obj.getName() ;
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        result += this.getAlive() ? 1 : 0;

        result = 31 * result + this.getHeartPoint();
        result = 31 * result + this.getDamage();

        return result;
    }

    @Override
    public String toString() {
        return  this.getName()  + " Damage = " + this.getDamage()  + " Is alive = " + this.getAlive() +  " Heartpoint = " +
                this.getHeartPoint()  ;
    }
}

