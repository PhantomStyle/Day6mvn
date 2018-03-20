package fff;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class CassierHelper {
    public static boolean printIfConditionPass(Passport p, Predicate<Passport> cond){
        if(cond.test(p)){
            return true;
        }
        return false;
    }

    public static Optional<Passport> findByName(List<Passport> passports, String fio){
        for(Passport passport : passports){
            if(passport.fio.equals(fio)){
                //passport.printPassport();
                return Optional.of(passport);
            }
        }
        return null;
    }
}
