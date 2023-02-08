package students.student_maksim_turcin.lesson_10_homeworks.level_1.task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
