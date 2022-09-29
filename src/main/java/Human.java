import java.io.Serializable;

abstract class Human extends Entity implements Serializable{
    private String team;

    public Human(){}

    public void setTeam(String color){
        team = color;
    }
    public String getTeam(){
        return team;
    }







}