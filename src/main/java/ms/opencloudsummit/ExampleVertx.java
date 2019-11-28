package ms.opencloudsummit;

import static io.vertx.core.http.HttpMethod.*;

import io.quarkus.vertx.web.Route;
import io.vertx.ext.web.RoutingContext;

public class ExampleVertx {
    @Route(path = "/api/vertx/hello", methods = GET)
    void hello(RoutingContext context) {
        context.response().headers().set("Content-Type", "text/plain");
        context.response().setStatusCode(200).end("Hello OSS SUMMIT 2019 - Vert.X");
    }
}
