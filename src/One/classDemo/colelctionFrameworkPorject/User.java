package One.classDemo.colelctionFrameworkPorject;

import java.util.Set;

public class User {
    private  String name;
    private boolean isActive;
    private Set<String> roles;

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public User(boolean isActive, String name, Set<String> roles) {
        this.isActive = isActive;
        this.name = name;
        this.roles = roles;
    }
    public Set<String> getRoles() {
        return roles;
    }
}
