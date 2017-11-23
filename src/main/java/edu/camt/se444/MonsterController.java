package edu.camt.se444;

import java.util.ArrayList;

import edu.camt.se444.AdventureGame.model.Monster;
import edu.camt.se444.AdventureGame.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MonsterController {
    @Autowired
    MonsterService monsterService;

    public void setToons(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    @RequestMapping("/monsters")
    public ArrayList<Monster> getAllMonster() {
        return monsterService.getAllMonster();
    }

    @RequestMapping("/monsters/{monstersName}")
    public Monster getMonster(@PathVariable String monstersName) {
        return monsterService.getMonster(monstersName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/monsters")
    public void addMonster(@RequestBody Monster m) {
        monsterService.addMonster(m);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/monsters/{monstersName}")
    public void updateMonster(@PathVariable String monstersName, @RequestBody Monster monster) {
        monsterService.updateMonster(monstersName, monster);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/monsters/{monstersName}")
    public void deleteMonster(@PathVariable String monstersName) {
        monsterService.deleteMonster(monstersName);
    }

}
