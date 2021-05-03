package GameProject.Managements;

import GameProject.Abstract.GameService;
import GameProject.Entites.Game;

public class GameManager implements GameService {
    @Override
    public void Add(Game game) { System.out.println("Game Added");}

    @Override

    public void Update(Game game) { System.out.println("Game Updated");}

    @Override
    public void Delete(Game game) { System.out.println("Game Deleted");}
}
