package b5310450513;

public class Inventory {

    int a; // 6 point
    String b; // 6 point
    int c; // 6 point
    
    public Inventory(int id, String name, int count) // 18 point
    {
        a = id;
        b = name;
        c = count;
    }

    public void menu() 
    {
        System.out.print("***What are you want to buy ?*** ");
        System.out.print(" ID1001: BOOK  or");
        System.out.print(" ID1002: Magazine  or");
        System.out.print(" ID1003: Comic ");
    }

    public void Stock(int a, int c, int book, int mag, int comic) // 0 point
    {
        switch (a) {

            case 1001:
                book = book - c;
                break;
            case 1002:
                mag = mag - c;
                break;
            case 1003:
                comic = comic - c;
                break;
        }
    }

    public void printstock(int id, String name, int book, int mag, int comic) // 0 point
    {
        System.out.print("OK All set! ");
        System.out.print("Are you want to buy :" + name);

        System.out.print("  **Instock have book = " + book);
        System.out.print("  Instock have magazine = " + mag);
        System.out.print("  Instock have comic = " + comic + "**");
    }
}
