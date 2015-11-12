package controllers;

import com.wordnik.swagger.annotations.*;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.ws.rs.PathParam;

@Api(value = "/users", description = "Operations about users")
public class UsersController extends Controller {

    @ApiOperation(nickname = "getUserById", value = "Find user by ID",
                  notes = "Returns a user", httpMethod = "GET")
    @ApiResponses( value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "User not found")
        }
    )

    public Result getUser(@ApiParam(value = "ID of the user to fetch") @PathParam("id") Long id) {
        if(id == 1l) {
            return status(Http.Status.BAD_REQUEST);
        } else {
            return ok("USER ID : " + id);
        }
    }

    @ApiOperation(nickname = "createUser", value = "Create new user",
            notes = "Create a user", httpMethod = "POST")
    @ApiResponses( value = {@ApiResponse(code = 400, message = "Invalid data")})
    @ApiImplicitParams(value = {@ApiImplicitParam(value = "User", required = true, dataType = "dto.UserDto", paramType = "body")})
    public Result newUser() {
        return ok("new user");
    }

}
