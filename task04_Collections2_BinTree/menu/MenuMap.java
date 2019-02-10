package epam.menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuMap {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner scanner = new Scanner(System.in);

    MenuMap() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();
        menu.put("1", "1 - Test My FuncInterface");
        menu.put("2", "2 - Test Command");
        menu.put("3", "3 - Test Streams");
        menu.put("4", "4 - Test text lines");
        menu.put("Q", "Q - exit");

        // methodsMenu.put("1",()-> System.out.println("testMyFuncInterface")); //example with lambda
        methodsMenu.put("1", this::testMyFuncInterface);
        methodsMenu.put("2", this::testCommand);
        methodsMenu.put("3", this::testStreams);
        methodsMenu.put("4", this::testTextLines);
        methodsMenu.put("Q", this::exit);
    }

    private void outputMenu() {
        System.out.println("\nMENU");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show(){
        String keyMenu;
        do{
            outputMenu();
            System.out.println("Please select menu point");
            keyMenu=scanner.nextLine().toUpperCase();
            try{
                methodsMenu.get(keyMenu).print();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(!keyMenu.equals("Q"));
    }

    private void testMyFuncInterface() {
        System.out.println("testMyFuncInterface");
    }

    private void testCommand() {
        System.out.println("testCommand");
    }

    private void testStreams() {
        System.out.println("testCommand");
    }

    private void testTextLines() {
        System.out.println("testTextLines");
    }

    private void exit() {
        System.out.println("exit");
    }


}
