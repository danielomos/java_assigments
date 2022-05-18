import java.util.Scanner;

public class MobilePhoneMenu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        displayMainmenu();
        int selection = input.nextInt();
        getMainmenu(selection);
    }



    public static void displayMainmenu() {
        String mainmenu = """
                Welcome!!!
                MainMenu
                        Enter 
                        1 for Phone Book
                        2 for Messages
                        3 for chat
                        4 for Call Register
                        5 for Tones
                        6 for Settings
                        7 for Call divert
                        8 for Games
                        9 for Calculator
                        10 for Reminders
                        11 for Clock
                        12 for Profiles
                        13 for SIM Services
                        0 for back
                """;

        System.out.println(mainmenu);
    }
    public static void displayMenu1() {
        String menu1 = """
                Phone Book:-
                            Enter 
                            1 for Search
                            2 for Service Nos.
                            3 for Add Name
                            4 for Erase
                            5  for Edit
                            6 for Assign tone
                            7 for Send b' Card
                            8  for Option
                            9 for Speend Dials
                            10 for Voice tags
                            0 for back
                """;
        System.out.println(menu1);
    }
    public static void displayMenu1_8() {
        String menu1_8 = """
            Option:-
            1 for Type of View
            2 for Memory Status
            0 for back
            """;System.out.println(menu1_8);
    }
    public static void displayMenu2() {
        String menu2 = """
            Messages:-
            1 for write Messages
            2 for inbox
            3 for Outbox
            4 for Picture Messages
            5 for Templates
            6 for Smileys
            7 for messages Settings
            8 for Info Services
            9 for Voice Mailbox Number
            10 for Service Command Editor
            0 for back
            """;
        System.out.println(menu2);
    }
    public static void displayMenu2_7() {
        String menu2_7 = """
            Message Settings
            1 for Set
            2 for Common
            0 for back
            """;System.out.println(menu2_7);
    }
    public static void displayMenu2_7_1() {
        String menu2_7_1 = """
            Set:-
            1 for Message centre number 
            2 for Messages Sent As
            3 Message validity
            0 for back
            """;
        System.out.println(menu2_7_1);
    }
    public static void displayMenu2_7_2() {
        String menu2_7_2 = """
            Common:-
            1 for Delivery Reports
            2 for Reply via same centre
            3 Character Support
            0 for back
            """;System.out.println(menu2_7_2);
    }
    public static void displayMenu3() {
        String menu3 = """
            Chat
            0 for back
            """;System.out.println(menu3);
    }
    public static void displayMenu4() {
        String menu4 = """
            Call Register
            1 for missed calls
            2 for received calls
            3 for dialled numbers
            4 for erase recent call lists
            5 for show call duration
            6 for show call costs
            7 for call cost settings
            8 for prepaid credit
            0 for back
            """;
        System.out.println(menu4);
    }
    public static void displayMenu4_5() {
        String menu4_5 = """
            Show call costs
            1 for last call duration
            2 for all call's duration
            3 for received call's duration
            4 for dialled calls duration
            5 for clear timers
            0 for back
            """;System.out.println(menu4_5);
    }
    public static void displayMenu4_6() {
        String menu4_6 = """
            Show call costs
            1 for last call cost
            2 for all call's cost
            3 for clear counters
            0 for back
            """;System.out.println(menu4_6);
    }
    public static void displayMenu4_7() {
        String menu4_7 = """
            call cost settings
            1 for call cost limit
            2 for show costs in
            0 for back
            """;
        System.out.println(menu4_7);
    }
    public static void displayMenu5() {
        String menu5 = """
            Tones
            1 for ringing tone
            2 for ringing volume
            3 for incoming call alert
            4 for composer
            5 for message alert tone
            6 for keypad tones
            7 for warming and game tones
            8 for vibrating alert
            9 screen saver
            0 for back
            """;System.out.println(menu5);
    }
    public static void displayMenu6() {
        String menu6 = """
            Settings
            1 for call settings
            2 for phone settings
            3 for security settings
            4 for restore factory settings
            0 for back
            """;System.out.println(menu6);
    }
    public static void displayMenu6_1() {
        String menu6_1 = """
            Call settings
            1 for Automatic redial
            2 for speed dialling
            3 for call waiting options
            4 for own number sending
            5 for phone line in use
            6 for automatic answer
            0 for back
                                   
            """;System.out.println(menu6_1);
    }
    public static void displayMenu6_2() {
        String menu6_2= """
            Phone Setting
            1 for language
            2 for cell info display
            3 for welcome note
            4 for network selection
            5 for light
            6 for confirm sim services actions
            0 for back
            """;System.out.println(menu6_2);
    }
    public static void displayMenu6_3() {
        String menu6_3 = """
            Security settings
            1 for Pin code request
            2 for call barring service
            3 for fixed dialling
            4 for closed user group
            5 for phone security
            6 for change access codes
            0 for back
            """;
        System.out.println(menu6_3);
    }
    public static void displayMenu7() {
        String menu7 = """
            Call divert
            0 for back
            """;System.out.println(menu7);
    }
    public static void displayMenu8() {
        String menu8 = """
            Games
            0 for back
            """;System.out.println(menu8);
    }
    public static void displayMenu9() {
        String menu9 = """
            calculator
            0 for back
            """;System.out.println(menu9);
    }
    public static void displayMenu10() {
        String menu10 = """
            Reminders
            0 for back
            """;System.out.println(menu10);
    }
    public static void displayMenu11() {
        String menu11 = """
            Clock
            1 for Alarm clock
            2 for Clock setting
            3 for date setting
            4 for stopwatch
            5 for countdown timer
            6 for auto update of date and time
            0 for back
            """;System.out.println(menu11);
    }
    public static void displayMenu12() {
        String menu12 = """
            Profiles  
            0 for back          
            """;System.out.println(menu12);
    }
    public static void displayMenu13() {
        String menu13 = """
            SIM services
            0 for back
            """;System.out.println(menu13);
    }


    //public static void getMainmenu(int feed){
    public static void getMainmenu(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                displayMenu1();
                getMenu1(input.nextInt());
                break;
            case 2:
                displayMenu2();
                getMenu2(input.nextInt());
                break;
            case 3:
                displayMenu3();
                getMenu3(input.nextInt());
                break;
            case 4:
                displayMenu4();
                getMenu4(input.nextInt());
                break;
            case 5:
                displayMenu5();
                getMenu5(input.nextInt());
                break;
            case 6:
                displayMenu6();
                getMenu6(input.nextInt());
                break;
            case 7:
                displayMenu7();
                getMenu7(input.nextInt());
                break;
            case 8:
                displayMenu8();
                getMenu8(input.nextInt());

                break;
            case 9:
                displayMenu9();
                getMenu9(input.nextInt());
                break;
            case 10:
                displayMenu10();
                getMenu10(input.nextInt());
                break;
            case 11:
                displayMenu11();
                getMenu11(input.nextInt());
                break;
            case 12:
                displayMenu12();
                getMenu12(input.nextInt());
                break;
            case 13:
                displayMenu13();
                getMenu13(input.nextInt());
                break;
            case 0:
                System.out.println("returing Back");
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
        }
    }

    public static void getMenu1(int feed) {
        Scanner input = new Scanner(System.in);

        switch (feed) {
            case 1:
                System.out.println("Search");

                break;
            case 2:
                System.out.println("Service Nos.");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
            case 6:
                System.out.println("Assign tone");
            case 7:
                System.out.println("Send b' Card");
                break;
            case 8:
                displayMenu1_8();
                getMenu1_8(input.nextInt());

                break;
            case 9:
                System.out.println("Speed Dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu1();
                getMenu1(input.nextInt());
                break;
        }

    }
    public static void getMenu1_8(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Type of View");
                break;
            case 2:
                System.out.println("Memory Status");
                break;
            case 0:
                displayMenu1();
                getMenu1(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu1_8();
                getMenu1_8(input.nextInt());
                break;
        }

    }
    public static void getMenu2(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("write Messages");
                break;
            case 2:
                System.out.println("inbox");
                break;
            case 3:
                System.out.println("outbox");
                break;
            case 4:
                System.out.println("Picture message");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;

            case 7:
                displayMenu2_7();
                getMenu2_7(input.nextInt());
                break;
            case 8:
                System.out.println("Info services");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu2_7();
                getMenu2_7(input.nextInt());
                break;
        }

    }
    public static void getMenu2_7(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                displayMenu2_7_1();
                getMenu2_7(input.nextInt());
            case 2:
                displayMenu2_7_2();
                getMenu2_7_2(input.nextInt());
                break;
            case 0:
                displayMenu2();
                getMenu2(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu2_7_1();
                getMenu2_7_1(input.nextInt());
                break;
        }

    }

    public static void getMenu2_7_1(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Message centre number");
                break;
            case 2:
                System.out.println("message sent as");
                break;
            case 3:
                System.out.println("message validity");
                break;
            case 0:
                displayMenu2_7();
                getMenu2_7(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu2_7_2();
                getMenu2_7_2(input.nextInt());
                break;
        }

    }

    public static void getMenu2_7_2(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Delivery reports");
                break;
            case 2:
                System.out.println("reply via centre");
                break;
            case 3:
                System.out.println("Character support");
                break;
            case 0:
                displayMenu2_7();
                getMenu2_7(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu2_7_1();
                getMenu2_7_1(input.nextInt());
                break;
        }

    }
    public  static void getMenu3(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Chat");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu3();
                getMenu3(input.nextInt());
                break;

        }

    }

    public static void getMenu4(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                displayMenu4_5();
                getMenu4_5(input.nextInt());
                break;

            case 6:
                displayMenu4_6();
                int feed2 = input.nextInt();
                getMenu4_6(feed2);
                break;
            case 7:
                displayMenu4_7();
                getMenu4_7(input.nextInt());
                break;
            case 8:
                System.out.println("Prepaid Credit");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu4();
                getMenu4(input.nextInt());
                break;
        }

    }
    public static void getMenu4_5(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All calls' duration");
                break;
            case 3:
                System.out.println("Received calls' duration");
                break;
            case 4:
                System.out.println("Dialled Calls' duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
            case 0:
                displayMenu4();
                getMenu4(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu4_5();
                getMenu4_5(input.nextInt());
                break;
        }

    }
    public static void getMenu4_6(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls cost");
                break;
            case 3:
                System.out.println("Clear Counters");
            case 0:
                displayMenu4();
                getMenu4(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu4_6();
                getMenu4_6(input.nextInt());
                break;
        }

    }
    public static void getMenu4_7(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show costs in");
                break;
            case 0:
                displayMenu4();
                getMenu4(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu4_7();
                getMenu4_7(input.nextInt());
                break;
        }

    }
    public static void getMenu5(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Ringing Tone");
                break;
            case 2:
                System.out.println("Ringing Volume");
            case 3:
                System.out.println("Incoming call Alert ");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad Tone");
                break;
            case 7:
                System.out.println("Warming an Game tones");
                break;
            case 8:
                System.out.println("Vibrating");
                break;
            case 9:
                System.out.println("Screen Saver");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu5();
                getMenu5(input.nextInt());
                break;
        }


    }

    public static void getMenu6(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                displayMenu6_1();
                getMenu6_1(input.nextInt());
                break;
            case 2:
                displayMenu6_2();
                getMenu6_2(input.nextInt());
                break;
            case 3:
                displayMenu6_3();
                getMenu6_3(input.nextInt());
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu6();
                getMenu6(input.nextInt());
                break;
        }

    }
    public static void getMenu6_1(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own Number Sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
            case 0:
                displayMenu6();
                getMenu6(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu6_1();
                getMenu6_1(input.nextInt());
                break;
        }

    }
    public static void getMenu6_2(int feed){
        Scanner input = new Scanner(System.in);

        switch (feed){
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network Selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service actions");
                break;
            case 0:
                displayMenu6();
                getMenu6(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu6_2();
                getMenu6_2(input.nextInt());
                break;
        }

    }
    public static void getMenu6_3(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Pin code request");
                break;
            case 2:
                System.out.println("Call barring Services");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone Security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
            case 0:
                displayMenu6();
                getMenu6(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu6_3();
                getMenu6_3(input.nextInt());
                break;
        }

    }
    public static void getMenu7(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Call divert");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu7();
                getMenu7(input.nextInt());
                break;
        }

    }
    public static void getMenu8(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println(" Games");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu8();
                getMenu8(input.nextInt());
                break;
        }


    }
    public static void getMenu9(int feed) {
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("calculator");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu9();
                getMenu9(input.nextInt());
                break;

        }
    }
    public static void getMenu10(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Reminders");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu10();
                getMenu10(input.nextInt());
                break;
        }

    }
    public static void getMenu11(int feed) {
        Scanner input = new Scanner(System.in);
        switch (feed){
            case 1:
                System.out.println("Alarm Clock");
                break;
            case 2:
                System.out.println("Clock Setting");
                break;
            case 3:
                System.out.println("Date Settings");
                break;
            case 4:
                System.out.println("stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu11();
                getMenu11(input.nextInt());
                break;
        }
    /*   displayMenu11();
            switch (feed) {
                case 1:
                    System.out.println("Alarm Clock");
                    break;
                case 2:
                    System.out.println("Clock Setting");
                    break;
                case 3:
                    System.out.println("Date Settings");
                    break;
                case 4:
                    System.out.println("stopwatch");
                    break;
                case 5:
                    System.out.println("Countdown timer");
                    break;
                case 6:
                    System.out.println("Auto update of date and time");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    break;
            }*/
    }



    public static void getMenu12(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("Profiles");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu12();
                getMenu12(input.nextInt());
                break;
        }
    }

    public static void getMenu13(int feed){
        Scanner input = new Scanner(System.in);
        switch (feed) {
            case 1:
                System.out.println("SIM services");
                break;
            case 0:
                displayMainmenu();
                getMainmenu(input.nextInt());
                break;
            default:
                System.out.println("Wrong input Enter again");
                displayMenu13();
                getMenu13(input.nextInt());
                break;
        }
    }

}




