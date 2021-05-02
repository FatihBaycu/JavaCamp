package GameProject.Managements;

import GameProject.Abstract.OrderService;
import GameProject.Entites.Campaign;
import GameProject.Entites.Game;
import GameProject.Entites.Gamer;

public class OrderManager implements OrderService {
    @Override
    public void Sell(Game game, Gamer gamer)  { System.out.println("Selled");}
    @Override
    public void SellWithCampaignPercent(Game game, Gamer gamer,Campaign campaign)  {
        System.out.println("Selled With Campaign");
        double newPrice=game.getPrice()/100*campaign.getPercent();
        game.setPrice(game.getPrice()-newPrice);
        gamer.setBalance(gamer.getBalance()-game.getPrice());
        System.out.println(game.getPrice());
        System.out.println(gamer.getBalance());

    }

    @Override
    public void SellWithCampaignDiscount(Game game, Gamer gamer, Campaign campaign) {
        game.setPrice(game.getPrice()-campaign.getDiscount());

        System.out.println("Oyuna "+campaign.getDiscount() +"TL indirim Yapıldı");

        gamer.setBalance(gamer.getBalance()-game.getPrice());
        System.out.println("You'r Balance "+gamer.getBalance());
    }
}
