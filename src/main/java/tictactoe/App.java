package tictactoe;

public class App {
    private String message;

    public App (String message) {
        this.message = message;    
    }

    public void sayHello(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        App theInstance = new App("Testing");
        theInstance.sayHello();
    }
}

//Ask HOW TO RUN GRADLE
//Ask about some basic git commands
//Ask How many main classes I should have (quick breakdown); I am following the checklist and wondering how I should approach it -> like do you reccomend using the code or just starting new
//Do scanner declarations need to be in main class? (I know they should be in a static class)
