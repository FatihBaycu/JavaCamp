package GameProject.Entites;

public class Order {
    private int id;
    private  int campaignId;
    private  int gameId;
    private int gamerId;

    public Order(int id, int campaignId, int gameId, int gamerId) {
        this.id = id;
        this.campaignId = campaignId;
        this.gameId = gameId;
        this.gamerId = gamerId;
    }

    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }
}
