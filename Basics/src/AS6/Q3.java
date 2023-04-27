package AS6;

import java.util.ArrayList;

class User {
    int age;
    String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String userList() {
        return "Name: " + name + ", Age: " + age;
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArrayList<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("Clayton", 19));
        listOfUsers.add(new User("Joshua", 20));
        listOfUsers.add(new User("John", 29));
        for(User id: listOfUsers) {
            System.out.println(id.userList());
        }
    }
}
