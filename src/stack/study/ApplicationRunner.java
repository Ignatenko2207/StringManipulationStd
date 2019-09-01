package stack.study;

import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        String firstName = "Alex";
        String lastName = "Ignatenko";

        String finalString = String.format("%s %s. And I'm %d years old.", firstName, lastName, 37);

        String email = "jhdvfvhj@sjfbx.kf";
        boolean isEmail = Pattern.matches(".+@.*\\..*", email);

        logger.severe(String.format("Email \"%s\" after validation returned %s value.", email, isEmail ));

//        finalString = finalString.replaceAll(" A", "\nA");
//        System.out.println(finalString);
//
//
//        String modifiedString = StringUtils.substringBefore(email, "@");


//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(firstName);
//        stringBuilder.append(" ");
//        stringBuilder.append(lastName);
//
//        stringBuilder.reverse();
//
//        System.out.println(stringBuilder.toString());
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(firstName);
//        stringBuffer.append(" ");
//        stringBuffer.append(lastName);
//
//        System.out.println(stringBuffer.toString());

    }
}
