package GameProject.Managements;

import GameProject.Abstract.OrderService;
import GameProject.Entites.Campaign;
import GameProject.Entites.Game;
import GameProject.Entites.Gamer;

public class OrderManager implements OrderService {
    @Override
    public void Sell(Game game, Gamer gamer)  {
        if (gamer.getBalance()<game.getPrice()){
            System.out.println("** insufficient balance **\n Game Price:"+game.getPrice()+"\n You'r Balance is "+gamer.getBalance());
        }

        else
        { gamer.setBalance(gamer.getBalance()-game.getPrice());
            System.out.println("Dear Gamer "+gamer.getFirstName()+"\n You'r Balance is "+gamer.getBalance()+" now.");
            System.out.println("Selled");
        }
    }

    @Override
    public void SellWithCampaignPercent(Game game, Gamer gamer,Campaign campaign)  {

        double newPrice=(game.getPrice()*campaign.getPercent())/100;

        game.setPrice(newPrice);
        if (gamer.getBalance()<game.getPrice()){
            System.out.println("** insufficient balance **\n Game Price with Camapign:"+game.getPrice()+"\n You'r Balance is "+gamer.getBalance());
        }
        else
        { gamer.setBalance(gamer.getBalance()-game.getPrice());
        System.out.println("Dear Gamer "+gamer.getFirstName()+"\n You'r Balance is "+gamer.getBalance()+" now.");
        System.out.println("Selled With Campaign");
        }
    }

    @Override
    public void SellWithCampaignDiscount(Game game, Gamer gamer, Campaign campaign) {

        double newPrice=game.getPrice()-campaign.getDiscount();

        game.setPrice(newPrice);
        if (gamer.getBalance()<game.getPrice()){
            System.out.println("** insufficient balance **\n Game Price with Discount:"+game.getPrice()+"\n You'r Balance is "+gamer.getBalance());
        }
        else
        { gamer.setBalance(gamer.getBalance()-game.getPrice());
            System.out.println("Dear Gamer "+gamer.getFirstName()+"\n You'r Balance is "+gamer.getBalance()+" now.");
            System.out.println("Selled With Campaign");
        }


    }
}
