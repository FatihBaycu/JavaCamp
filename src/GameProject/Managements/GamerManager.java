package GameProject.Managements;

import GameProject.Abstract.GamerService;
import GameProject.Entites.Gamer;

public class GamerManager implements GamerService {
    @Override
    public void Add(Gamer gamer){ System.out.println("Gamer Added");}

    @Override
    public void Update(Gamer gamer) { System.out.println("Gamer Updated");}

    @Override
    public void Delete(Gamer gamer) { System.out.println("Gamer Deleted");}
}
