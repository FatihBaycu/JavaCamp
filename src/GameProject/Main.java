package GameProject;

import GameProject.Entites.Campaign;
import GameProject.Entites.Game;
import GameProject.Entites.Gamer;
import GameProject.Entites.Order;
import GameProject.Managements.CampaignManager;
import GameProject.Managements.GameManager;
import GameProject.Managements.GamerManager;
import GameProject.Managements.OrderManager;

public class Main {
    public static void main(String[] args) {
        System.out.println(".....Welcome to my Game Project.....");


        Game game=new Game();
        game.setId(1);
        game.setName("Gta V");
        game.setPrice(150);
        GameManager gameManager=new GameManager();
        gameManager.Add(game);

        Gamer gamer=new Gamer();
        gamer.setId(1);
        gamer.setNationalIdentity("123546789");
        gamer.setFirstName("Arda");
        gamer.setLastName("Adra");
        gamer.setBirthYear(2012);
        gamer.setBalance(250);
        GamerManager gamerManager=new GamerManager();
        gamerManager.Add(gamer);

        Campaign campaign=new Campaign();
        campaign.setId(1);
        campaign.setName("Yeni Kullanıcı");
        campaign.setDiscount(50);
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.Add(campaign);


        Order order=new Order();
        order.setId(1);
        order.setGameId(1);
        order.setGamerId(1);
        order.setCampaignId(1);
        OrderManager orderManager=new OrderManager();
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);
        orderManager.SellWithCampaignDiscount(game,gamer,campaign);

    }
}
