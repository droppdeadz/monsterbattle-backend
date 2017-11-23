package edu.camt.se444.AdventureGame.services;

import edu.camt.se444.AdventureGame.model.Monster;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MonsterService {
    ArrayList<Monster> monsters = new ArrayList<Monster>();

    public MonsterService(){
        Monster monster1 = new Monster(149,"Dragonite","Dragon, Flying",75,80,200,7);
        Monster monster2 = new Monster(150,"Mew Two","Psychic",95,80,150,9);


        monsters.add(monster1);
        monsters.add(monster2);
    }

    public ArrayList<Monster> getAllMonster() {
        return monsters;
    }
    public Monster getMonster(String monstersName){
        return (Monster) monsters.stream().filter(m -> m.getMonstersName().equals(monstersName)).findFirst().get();
    }
    public void addMonster(Monster m){
        this.monsters.add(m);
    }
    public void updateMonster(String monstersName,Monster monster){
        int i = 0;
        for (Monster m: monsters){
            if(m.getMonstersName().equals(monstersName)){
                monsters.set(i,monster);
            }
            i++;
        }
    }
    public void deleteMonster(String monstersName){
        monsters.removeIf(m -> m.getMonstersName().equals(monstersName));
    }
}