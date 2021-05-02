package GameProject.Managements;

import GameProject.Abstract.UserService;
import KodlamaIo.Entities.User;

public class UserManager implements UserService {
    @Override
    public void Add(User user)  { System.out.println("User Added");}

    @Override
    public void Update(User user)  { System.out.println("User Updated");}

    @Override
    public void Delete(User user) { System.out.println("User Deleted");}
}
