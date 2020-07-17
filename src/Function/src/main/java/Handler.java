import java.util.HashMap;
import java.util.logging.Logger;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.google.gson.Gson;

public class Handler {
    public Object handler(Object event) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(event));
        System.out.println("Woohoo!");

        return new HashMap();
    }
}
