import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int year) {
        this(1, 1, year);
    }

    public Date(int month, int year) {
        this(0, month, year);
    }

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
            return;
        }
        System.out.println("Invalid Month");
        this.month = 1;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(this.month == 2) {
            if(this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
                if(day >= 1 && day <= 29) {
                    this.day = day;
                    return;
                }
                System.out.println("Invalid Day");
                this.day = 1;
                return;
            }
            if(day >= 1 && day <= 28) {
                this.day = day;
                return;
            }
            System.out.println("Invalid Day");
            this.day = 1;
            return;
        }
        else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            if(day >= 1 && day <= 30) {
                this.day = day;
                return;
            }
            System.out.println("Invalid Day");
            this.day = 1;
            return;
        }
        else if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
            if (day >= 1 && day <= 31) {
                this.day = day;
                return;
            }
            System.out.println("Invalid Day");
            this.day = 1;
            return;
        }
        System.out.println("Invalid Day");
        this.day = 1;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void UserInputDate(Scanner sc) {
        System.out.println("Please Enter Year:  ");
        this.setYear(sc.nextInt());
        System.out.println("Please Enter Month:  ");
        this.setMonth(sc.nextInt());
        System.out.println("Please Enter Day:  ");
        this.setDay(sc.nextInt());
    }

    public void displayDate() {
        System.out.println();
        System.out.println(this.day + "/" + this.month + "/" + this.year);
        System.out.println();
    }

    public void displayDateWithMonthNames () {
        String monthName = switch (this.month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
        System.out.println();
        System.out.println(monthName + " " + this.day + "  " + this.year);
        System.out.println();
    }

    public Date addDate(Date date) {
        int day = this.day + date.day;
        int month = this.month + date.month;
        int year = this.year + date.year;
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
        return new Date(day, month, year);
    }

}
