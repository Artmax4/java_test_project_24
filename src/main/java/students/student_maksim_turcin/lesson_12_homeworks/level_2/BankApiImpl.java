package students.student_maksim_turcin.lesson_12_homeworks.level_2;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;


public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            for (BankClient client : clients) {
                if (client.getUid().equals(uid)) {
                    return Optional.of(client);
                }
            }
        } else
            throw new AccessDeniedException("missing credentials");
        return Optional.empty();
    }
}