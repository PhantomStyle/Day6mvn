package fff;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Passport passport = new Passport();
        passport.dateOfBitrh = LocalDate.of(1998, 05, 29);
        CassierHelper.printIfConditionPass(passport, passport1 -> {
            if (ChronoUnit.YEARS.between(passport1.dateOfBitrh, LocalDate.now()) >= 18) {
                System.out.println("Yes");
                return true;
            }
            System.out.println("No");
            return false;
        });

        List passports = new ArrayList<>();
        passports.add(new Passport());
        passports.add(new Passport("qwe", LocalDate.of(1998, 12, 15)));
        passports.add(new Passport("rty", LocalDate.of(1997, 11, 11)));
        //CassierHelper.findByName(passports, "qwe");

        Optional<Object> empty = Optional.empty();

        Optional<Passport> pas = Optional.of(passport);

        CassierHelper.findByName(passports, "qwe").ifPresent(p-> System.out.println(p.toString()));
        ;

        //Optional.of(ifPresent(passport1 -> CassierHelper.findByName(passports, "qwe")));


    }
}
