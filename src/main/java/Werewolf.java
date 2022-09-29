import java.io.Serializable;

public class Werewolf extends Beast implements Serializable {
    private boolean activeForm;

    public Werewolf(){countEntity++;}

    public void setActiveForm(boolean activeForm) {
        this.activeForm = activeForm;
    }

    public boolean getActiveForm() {
        return activeForm;
    }

    public void transformation(){
        if (activeForm)  {
            this.setHeartPoint(this.getHeartPoint()*2);
            this.setDamage(this.getDamage()*2);
        }
    }

    @Override
    public void voice() {
        System.out.println("Woooooooo!");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Werewolf obj = (Werewolf) o;
        return this.getAlive() == obj.getAlive() && this.getHeartPoint() == obj.getHeartPoint()
                && this.getDamage() == obj.getDamage() && this.getName() == obj.getName();
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
                this.getHeartPoint() ;
    }


}
