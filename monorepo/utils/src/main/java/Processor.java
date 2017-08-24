public class Processor {

    private static String token = ":";

    public String process(String input) {
        saveInputInDatabase(input);
        return input.length() + token + input.hashCode();
    }

    private void saveInputInDatabase(String input) {
        // do complicated DB stuff here
    }
}
