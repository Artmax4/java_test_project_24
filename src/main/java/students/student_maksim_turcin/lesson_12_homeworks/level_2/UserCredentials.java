package students.student_maksim_turcin.lesson_12_homeworks.level_2;

import java.util.Collection;
import java.util.List;

public class UserCredentials {
    private List<Role> roles;
    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return this.roles;
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }
}
