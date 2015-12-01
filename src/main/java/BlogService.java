import static spark.Spark.*;

/**
 * Created by nasir on 4/11/15.
 */
public class BlogService {

    public static void main(String[] args) {
        get("/post", (req, res) -> {
            return "Hello Sparkingly World";
        });
    }
}
