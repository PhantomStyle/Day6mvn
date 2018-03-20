package fff;

import java.time.LocalDate;

public class Passport {
    public String fio;
    public LocalDate dateOfBitrh;


    public Passport(String fio, LocalDate dateOfBitrh) {
        this.fio = fio;
        this.dateOfBitrh = dateOfBitrh;
    }

    public Passport() {
        fio = "uio";
        dateOfBitrh = LocalDate.of(1996, 05, 30);
    }

    public void printPassport(){
        System.out.println(fio + " " + dateOfBitrh);
    }
}
