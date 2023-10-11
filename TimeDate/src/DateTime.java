public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public void printDateTime() {
        date.displayDate();
        time.displayUniversalTime();
    }

    public void addDateTime(DateTime dateTime) {
        int second = this.time.getSeconds() + dateTime.time.getSeconds();
        int extraMinutes = second / 60;
        second %= 60;
        int minute = this.time.getMinutes() + dateTime.time.getMinutes() + extraMinutes;
        int extraHours = minute / 60;
        minute %= 60;
        int hour = this.time.getHours() + dateTime.time.getHours() + extraHours;
        int extraDay = hour /24;
        hour %= 24;
        int day = this.date.getDay() + dateTime.date.getDay() + extraDay;
        int month = this.date.getMonth() + dateTime.date.getMonth();
        int year = this.date.getYear() + dateTime.date.getYear();

        if(month > 12) {
            month -= 12;
            year++;
        }
        if(month == 2) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if(day > 29) {
                    day -= 29;
                    month++;
                }
            }
            else if(day > 28) {
                day -= 28;
                month++;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                day -= 30;
                month++;
            }
        }
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if(day > 31) {
                day -= 31;
                month++;
            }
        }
        System.out.println();
        System.out.printf("The New Date is %d / %d / %d",day, month, year );
        System.out.println();
        System.out.printf("The New Time is %d : %d : %d",hour, minute, second );
        System.out.println();
    }

}
