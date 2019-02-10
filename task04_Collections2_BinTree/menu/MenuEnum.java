package epam.menu;

import java.util.Scanner;

public enum MenuEnum {
    MY_FUNC_INTERFACE(()->testMyFuncInterface()),
    COMMAND(()-> testCommand()),
    STREAMS(()->{
        testStreams();
    }),
    TEXT_LINES(()->{
        testTextLines();
    }),
    EXIT(()->{
        exit();
    });

    private static void outputMenu() {
        System.out.println("\nMENU");
        int i=1;
        for (MenuEnum menuEnum : MenuEnum.values()) {
            System.out.println(""+ i++ +" - "+menuEnum);
        }
    }
    public static void show(){
        Scanner scanner = new Scanner(System.in);
        String keyMenu;
        do{
            outputMenu();
            System.out.println("Please select menu point");
            keyMenu=scanner.nextLine().toUpperCase();
            try{
                MenuEnum.values()[Integer.parseInt(keyMenu)-1].printable.print();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(!keyMenu.equals("5"));
    }
    private Printable printable;
    MenuEnum(Printable printable) {
        this.printable=printable;
    }
    private static void testMyFuncInterface() {
        System.out.println("testMyFuncInterface");
    }

    private static void testCommand() {
        System.out.println("testCommand");
    }

    private static void testStreams() {
        System.out.println("testCommand");
    }

    private static void testTextLines() {
        System.out.println("testTextLines");
    }

    private static void exit() {
        System.out.println("exit");
    }

    public static void main(String[] args) {

    }
}
