import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Swordsman tin = new Swordsman();
        Swordsman tin2 = new Swordsman();
        Werewolf wok = new Werewolf();
        Gson gson = new Gson();

        tin.setName("Tupoy");
        tin2.setName("Tupoy2");
        tin.setHeartPoint(21);
        tin2.setHeartPoint(22);
        tin.setDamage(21);
        tin2.setDamage(22);
        tin.setAlive(true);
        tin2.setAlive(true);
        tin.setTeam("Blue");
        tin2.setTeam("Red");
        tin.setArmor(20);
        tin2.setArmor(19);
        wok.setHeartPoint(30);
        wok.setDamage(15);

        wok.voice();
        wok.setActiveForm(true);
        wok.transformation();


        String json = gson.toJson(tin);
        String json1 = gson.toJson(tin2);
        String json2 = gson.toJson(wok);
        Swordsman[] tins = new Swordsman[tin2.getCountEntity()];

        try(FileWriter writer = new FileWriter("cursed.json", false))
        {
            writer.write(json);
            writer.append('\n');
            writer.write(json1);
            writer.append('\n');
            writer.write(json2);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try {
            File file = new File("cursed.json");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            tins[0] = new Gson().fromJson(line,Swordsman.class);
            System.out.println(tins[0].toString());
            int count = 1;
            while (line != null) {
                line = reader.readLine();
                if (line == null){
                    break;
                }
                    tins[count] = new Gson().fromJson(line, Swordsman.class);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /*
        Блок с сериализацией
        */
        try{
            FileOutputStream fos = new FileOutputStream( "C:\\Users\\Admin\\IdeaProjects\\j3\\tin.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(tin);
            oos.writeObject(tin2);
            oos.writeObject(wok);

            oos.close();
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println(tins[0].toString() + "\n" + tins[1].toString() +"\n"+ tins[2].toString() );



    }
}
