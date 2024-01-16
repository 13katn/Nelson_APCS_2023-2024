import java.util.Scanner;

public class ZodiacCalendarOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        System.out.println("What's your name: ");
        name = scan.nextLine();
        System.out.println("What's your birth year: ");
        int year = scan.nextInt();
        scan.close();
        zodiacMethod(year, name);
    }

    public static void zodiacMethod(int year, String name) { // honestly pretty simple from here on out, just set up if statments (use == not =) to set it so each zodiac animal has its correlating years using or || ) 
        if (year >= 1970 && year <= 2040) { // and every year after the first row you just +1 to the number in the previous column OR just add twelve years to the first date in the row ...so you dont even haev to look at a zodiac calendar once u have the first if statment done u jsut go off of that until every year has been hit- super simple just a bunch of lines of code tho 
            if (year == 1972 || year == 1984 || year == 1996 || year == 2008 || year == 2020 || year == 2032) {
                System.out.println("Your birth year on the zodiac calendar is a rat!");
            } else if (year == 1973 || year == 1985 || year == 1997 || year == 2009 || year == 2021 || year == 2033) {
                System.out.println("Your birth year on the zodiac calendar is an ox");
            } else if (year == 1974 || year == 1986 || year == 1998 || year == 2010 || year == 2022 || year == 2034) {
                System.out.println("Your birth year on the zodiac calendar is a tiger");
            } else if (year == 1975 || year == 1987 || year == 1999 || year == 2011 || year == 2023 || year == 2035) {
                System.out.println("Your birth year on the zodiac calendar is a rabbit");
            } else if (year == 1976 || year == 1988 || year == 2000 || year == 2012 || year == 2024 || year == 2036) {
                System.out.println("Your birth year on the zodiac calendar is a dragon");
            } else if (year == 1977 || year == 1989 || year == 2001 || year == 2013 || year == 2025 || year == 2037) {
                System.out.println("Your birth year on the zodiac calendar is a snake");
            } else if (year == 1978 || year == 1990 || year == 2002 || year == 2014 || year == 2026 || year == 2038) {
                System.out.println("Your birth year on the zodiac calendar is a horse");
            } else if (year == 1979 || year == 1991 || year == 2003 || year == 2015 || year == 2027 || year == 2039) {
                System.out.println("Your birth year on the zodiac calendar is a goat");
            } else if (year == 1980 || year == 1992 || year == 2004 || year == 2016 || year == 2028 || year == 2040) {
                System.out.println("Your birth year on the zodiac calendar is a monkey");
            } else if (year == 1981 || year == 1993 || year == 2005 || year == 2017 || year == 2029) {
                System.out.println("Your birth year on the zodiac calendar is a rooster");
            } else if (year == 1982 || year == 1994 || year == 2006 || year == 2018 || year == 2030) {
                System.out.println("Your birth year on the zodiac calendar is a dog");
            } else if (year == 1983 || year == 1995 || year == 2007 || year == 2019 || year == 2031) {
                System.out.println("Your birth year on the zodiac calendar is a pig");
            } else {
                System.out.println("The year you entered doesn't fit this calendar. Sorry :/");
            }
        } else {
            System.out.println("Please enter a year between 1970 and 2040.");
        }
    }
}