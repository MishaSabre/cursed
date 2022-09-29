import java.io.Serializable;

abstract class Entity implements Serializable{
    private String name;
    private int heartPoint;
    private int damage;
    private boolean alive;
    static int countEntity;

    public Entity(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHeartPoint(int heartPoint){
        this.heartPoint = heartPoint;
    }
    public int getHeartPoint(){
        return heartPoint;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }

    public int getCountEntity(){
        return countEntity;
    }

    public void hit(Entity smbd){
        smbd.setHeartPoint(smbd.getHeartPoint() - this.getDamage());
    }
    public void hit(Swordsman smbd){
        smbd.setHeartPoint(smbd.getHeartPoint() + smbd.getArmor() - this.getDamage());
    }


}