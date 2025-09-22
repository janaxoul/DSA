package multithreading.whiteBoardProblem;

public class Teacher extends Thread {
    WhiteBoard wb;
    String notes[]={"The server woke up and chose violence—500 Internal Error.",
            "Coffee is just a compiler for human code.",
            "Why do ducks fly south? Because it's too far to walk.",
            "NullPointerException: Because you believed in something that didn’t exist.",
            "Yesterday I accidentally deployed to production. Today I’m a legend.",
            "Concurrency is like juggling chainsaws—cool until it’s not.",
            "The database said no, and now we cry in SQL.",
            "I asked the JVM for mercy. It gave me a stack trace.",
            "Debugging is like being the detective in a crime movie where you’re also the murderer.",
            "The cloud is just someone else's computer with better marketing.",
            "My code runs perfectly… until someone uses it.",
            "Thread.sleep() is my way of saying 'I need a break too.'",
            "The API returned 200 OK, but my soul didn’t.",
            "I tried to fix a bug and created three new ones. Classic.",
            "If statements are just trust issues in code."
    };
    String text;
    public Teacher(WhiteBoard wb){
        this.wb=wb;
    }
    public void run(){
        for (String note : notes) {
            wb.write(note);
        }
        wb.write("end");
    }
}
