package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class HelloHandler implements Handler {

    @Override
    public void handle(@NotNull Context context) throws Exception {
        context.result("Hello from the HelloHandler Implementation!");

    }
}
