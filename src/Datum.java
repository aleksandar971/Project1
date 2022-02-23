import java.util.GregorianCalendar;

public class Datum {
    static void ispisiTrenutniDatumIVreme() {
        GregorianCalendar kal = new GregorianCalendar();
        System.out.println(kal.getTime());
    }

    static void promeniDatum(GregorianCalendar datum) {
//Meseci krecu od nule pa je broj za januar
//0 a ne 1.
        datum.set(2000, 0, 1);
    }

    static void promeniDatumIVreme(GregorianCalendar datum) {
//Meseci krecu od nule pa je broj za decembar
//11 a ne 12.
        datum.set(1999, 11, 31, 23, 59, 59);
    }

    static void ispisiPosebno(GregorianCalendar datum) {
        int godina = datum.get(GregorianCalendar.YEAR);
        int mesec = datum.get(GregorianCalendar.MONTH) + 1;
        int dan = datum.get(GregorianCalendar.DAY_OF_MONTH);
        int sat = datum.get(GregorianCalendar.HOUR);
        int minute = datum.get(GregorianCalendar.MINUTE);
        int sekunde = datum.get(GregorianCalendar.SECOND);
        System.out.println(dan + "." + mesec + "." + godina +
                ". " + sat + ":" + minute + ":" + sekunde);
    }

    static void starijaOsoba(GregorianCalendar dat_rodj_1,
                             GregorianCalendar dat_rodj_2) {
        if (dat_rodj_1.before(dat_rodj_2))
            System.out.println("Starija je prva osoba");
        else
            System.out.println("Starija je druga osoba");
    }
}
