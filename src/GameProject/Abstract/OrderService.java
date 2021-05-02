package GameProject.Abstract;

import GameProject.Entites.Campaign;
import GameProject.Entites.Game;
import GameProject.Entites.Gamer;

public interface OrderService {
    void Sell(Game game, Gamer gamer);
    void SellWithCampaignPercent(Game game, Gamer gamer,Campaign campaign);
    void SellWithCampaignDiscount(Game game, Gamer gamer,Campaign campaign);
}
