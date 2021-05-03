package GameProject.Managements;

import GameProject.Abstract.GamerService;
import GameProject.Entites.Gamer;

public class GamerManager implements GamerService {
    @Override
    public void Add(Gamer gamer){checkValidate(gamer,"Added");}

    @Override
    public void Update(Gamer gamer) { checkValidate(gamer,"Updated");}

    @Override
    public void Delete(Gamer gamer) { System.out.println("Gamer Deleted");}

        public void checkValidate(Gamer gamer, String message){
        if(gamer.getFirstName().length()<=2 || gamer.getLastName().length()<=2  || gamer.getBirthYear()<=2003){
             System.out.println("Gamer not "+message);

        }
        else   System.out.println("Gamer Added");

    }

    }

