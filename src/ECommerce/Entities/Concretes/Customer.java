package ECommerce.Entities.Concretes;

import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Entities.Entity;

public class Customer extends User implements Entity {

    private int customerId;
    private String nationalityId;
    private int userId;

    public Customer() {}

    public Customer(String nationalityId, int userId,int customerId) {
        this.nationalityId = nationalityId;
        this.userId = userId;
        this.customerId=customerId;
    }

    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId)
    {
        this.customerId=customerId;
    }
    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
