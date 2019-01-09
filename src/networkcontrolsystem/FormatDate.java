/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package networkcontrolsystem;

/**
 *
 * @author OGINNI
 */
public class FormatDate {

    public String getDate(String date) {
        int limit = 0;
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 8));
        String myDay, myMonth;
//       System.out.println("mont "+ month+" "+day);

        if ((month == 9) || (month == 4) || (month == 6) || (month == 11)) {
            limit = 30;
        } else if ((month == 2) && ((year % 4) == 0)) {
            limit = 29;
        } else if ((month == 2) && ((year % 4) > 0)) {
            limit = 28;
        } else {
            limit = 31;
        }
        if (month == 12 && day == 31) {
            month = 1;
            day = 0;
            year++;
        }

        if (limit == 30 && day == 30) {
            month++;
            day = 0;
        }
        if (limit == 31 && day == 31) {
            month++;
            day = 0;
        }
        if (limit == 29 && day == 29) {
            month++;
            day = 0;
        }
        if (limit == 28 && day == 28) {
            month++;
            day = 0;
        }
        day++;



        if ((day + "").length() == 1) {
            myDay = "0" + day;
        } else {
            myDay = "" + day;
        }

        if ((month + "").length() == 1) {
            myMonth = "0" + month;
        } else {
            myMonth = "" + month;
        }
        date = myMonth + "/" + myDay + "/" + year;
//       System.out.println("date  "+date);
        return date;
    }

    String getDateFormat(String date) {
        String myDay, myMonth;
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 8));
        if ((day + "").length() == 1) {
            myDay = "0" + day;
        } else {
            myDay = "" + day;
        }

        if ((month + "").length() == 1) {
            myMonth = "0" + month;
        } else {
            myMonth = "" + month;
        }
        date = myDay + "/" + myMonth + "/" + year;
        return date;
    }

    boolean checkDate(String startDate, String stopDate) {
        boolean rpt;
        int d1, m1, y1;
        int d2, m2, y2;
        d1 = subDay(startDate);
        m1 = subMonth(startDate);
        y1 = subYear(startDate);
        d2 = subDay(stopDate);
        m2 = subMonth(stopDate);
        y2 = subYear(stopDate);
        if (y2 >= y1) {
            if (m2 >= m1) {
                if (d2 >= d1) {
                    rpt = true;
                } else {
                    rpt = false;
                }

            } else {
                rpt = false;
            }

        } else {
            rpt = false;
        }
        return rpt;
    }

    int subMonth(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        return month;
    }

    int subDay(String date) {
        int day = Integer.parseInt(date.substring(3, 5));
        return day;
    }

    int subYear(String date) {
        int year = Integer.parseInt(date.substring(6, 8));
        return year;
    }
    int subYear4(String date) {
        int year = Integer.parseInt(date.substring(6, 10));
        return year;
    }
}
