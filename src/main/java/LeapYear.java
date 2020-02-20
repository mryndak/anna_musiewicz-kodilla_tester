public class LeapYear { // klasa i pola klasy
    int year;


    public LeapYear(int year) {  // konstruktor
        this.year = year;
    }


    public boolean isLeapYear() {
        if (((this.year %4 == 0) || (this.year % 400 == 0 ) && (this.year % 100 !=0))) {
            return true;
        } else {
            return false;
        }
    }



}
