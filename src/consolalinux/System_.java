/*
Nombres: Giuliano Bardecio [256113] y Vittorio Caiafa [252295]
*/

package consolalinux;

import java.util.ArrayList;

public class System_ {
    private ArrayList<User_> userList;
    private User_ loggedUser;
    
    public System_() {
        userList = new ArrayList<>();
        loggedUser = null;
    }
    
    public void addUser(User_ user_){
        userList.add(user_);
    }
    
    public User_ getUser(String name){
        User_ user = null;
        for (User_ userInList : userList){
            if (userInList.getName().equals(name)){
                user = userInList;
            }
        }
        return user;
    }
        
    public void setLoggedUser(User_ user){
        loggedUser = user;
    }
    
    public User_ getLoggedUser(){
        return this.loggedUser;
    }
}
