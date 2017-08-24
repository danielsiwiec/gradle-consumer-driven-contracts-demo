public class MainApp {
    public static void main(String[] args) {
        Processor processor = new Processor();
        String result = processor.process("foo");
        System.out.println(result.split(":")[0]);
    }
}
