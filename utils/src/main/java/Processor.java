public class Processor {

    private static String token = ":";

    public String process(String input) {
        saveInputInDatabase(input);
        return input.hashCode() + token + input.length();
    }

    private void saveInputInDatabase(String input) {
        // do complicated DB stuff here
    }
}
