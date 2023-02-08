package students.student_maksim_turcin.lesson_12_homeworks.level_2;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
