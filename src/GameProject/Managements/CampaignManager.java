package GameProject.Managements;

import GameProject.Abstract.CampaignService;
import GameProject.Entites.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void Add(Campaign campaign) { System.out.println("Campaign Added");}

    @Override
    public void Update(Campaign campaign) { System.out.println("Campaign Updated");}

    @Override
    public void Delete(Campaign campaign) { System.out.println("Campaign Deleted");}
}
