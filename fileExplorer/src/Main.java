import java.io.IOException;

public  class Main {
    public static void main(String[] args) throws IOException {
        fileReader start = new fileReader();
        start.Counting();
        fileCopy photo = new fileCopy();
        photo.copy();
        greetings sms = new greetings();
        sms.massage();
    }
}