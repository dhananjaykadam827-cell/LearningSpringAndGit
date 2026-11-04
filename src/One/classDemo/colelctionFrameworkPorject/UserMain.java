package One.classDemo.colelctionFrameworkPorject;

import java.util.*;

public class UserMain {
 public static void main(String[] args) {
        Set<String> user1roles = new HashSet<>(Arrays.asList("admin"));
        User u1 = new User(true,"danny",user1roles);

        Set<String> user2roles = new HashSet<>(Arrays.asList("admin", "user"));
        User u2 = new User(false,"dk",user2roles);

        Set<String> user3roles = new HashSet<>(Arrays.asList( "user"));
        User u3 = new User(true,"nik",user3roles);

        Set<String> user4roles = new HashSet<>(Arrays.asList("admin"));
        User u4 = new User(true,"jhon",user4roles);

        List<User> list = new ArrayList<>();

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

        Iterator<User> it = list.iterator();
        while (it.hasNext()){
            if(!it.next().isActive())
                it.remove();
        }

        for (User user: list){
            System.out.println(user.getName());
        }

        //count users per role
        Map<String, Integer> map = new HashMap<>();
     for (User user : list) {
         for (String role : user.getRoles()) {
             map.put(role, map.getOrDefault(role, 0) + 1);
         }
     }

     System.out.println(map);
    }
}
