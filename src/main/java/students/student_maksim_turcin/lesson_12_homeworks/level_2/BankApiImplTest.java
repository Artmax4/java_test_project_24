package students.student_maksim_turcin.lesson_12_homeworks.level_2;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        test.findByUidtest();
    }

    public void findByUidtest() {

        List<Role> testRoles = new ArrayList<>() {
        };
        testRoles.add(Role.Director);
        testRoles.add(Role.Administrator);
        testRoles.add(Role.CAN_SEARCH_CLIENTS);

        UserCredentials testUserCredentials = new UserCredentials(testRoles);

        List<BankClient> testBankClients = new ArrayList<>();
        testBankClients.add(new BankClient("1", "Spiderman"));
        testBankClients.add(new BankClient("2", "Batman"));

        Optional<BankClient> resultClient;
        BankApiImpl testBankApi = new BankApiImpl(testBankClients);
        try {
            resultClient = testBankApi.findByUid(testUserCredentials, "1");
            if (!resultClient.isEmpty() && resultClient.get().getFullName().equals("Spiderman")) {
                System.out.println("bankApiImplTest = OK");
            } else {
                System.out.println("bankApiImplTest = FALSE");
            }
        } catch (AccessDeniedException e) {
            System.out.println("bankApiImplTest = FALSE");

        }

    }


    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch (AccessDeniedException e) {
            System.out.println("TEST shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole = OK");
        }

    }
}
