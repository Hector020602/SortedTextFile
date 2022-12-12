import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SortedTextFile s = new SortedTextFile("test.txt");
        /*s.put("ccccc");
        s.put("aaaaa");
        s.put("bbbbb");
        s.put("ccccc");
        s.put("ddddd");
        s.put("aaaaa");*/
        SortedTextFile.merge("test.txt", "test2.txt", "testout.txt");
    }
}
