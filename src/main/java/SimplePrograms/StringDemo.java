package SimplePrograms;

import java.util.Locale;
//Program 1
//Convert letters from uppercase to lowercase
public class StringDemo {
    public static void main(String[] args) {
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //program2
        //To replace text spaces with underscores
        String text = "Jack Johny      Parker";
        text = text.replace(" ","_");
        System.out.println(text);

    }
}
