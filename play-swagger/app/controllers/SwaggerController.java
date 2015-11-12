package controllers;

import play.mvc.*;
import views.html.*;

public class SwaggerController extends Controller {

    public Result swagger() {
        return ok(swaggerui.render());
    }
}
