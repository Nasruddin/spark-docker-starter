import static spark.Spark.*;

/**
 * Created by nasir on 4/11/15.
 */
public class Main {
    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello World");
    }
}
