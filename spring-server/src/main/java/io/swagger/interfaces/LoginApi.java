/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.interfaces;

import io.swagger.model.LoginInformation;
import io.swagger.annotations.*;
import io.swagger.model.Meal;
import io.swagger.model.UserWithRole;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-28T06:14:18.281Z")

@Api(value = "login", description = "the login API")
@RequestMapping(value = "/api/v1")
public interface LoginApi {

    @ApiOperation(value = "Deletes a user login information", nickname = "deleteLoginInforation", notes = "Delete login information of a user.", tags={ "login information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted successfuly"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/login/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLoginInforation(@ApiParam(value = " to delete",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "get login information of a user.", nickname = "getLoginInformation", notes = "Returns a single login information", response = LoginInformation.class, tags={ "login information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LoginInformation.class),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/login/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LoginInformation> getLoginInformation(@ApiParam(value = "information of a user to return",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "register with new username and password", nickname = "loginInformation", notes = "This table holds the secret information of member/manager/admins", tags={ "login information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "information saved.."),
        @ApiResponse(code = 400, message = "bad request..") })
    @RequestMapping(value = "/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LoginInformation> saveLoginInformation(@ApiParam(value = "login_information object that needs to be added to the db" ,required=true )  @Valid @RequestBody LoginInformation body);


    @ApiOperation(value = "Update an existing user informatin", nickname = "updateLoginInformation", notes = "Update username or password.", tags={ "login information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfull"),
        @ApiResponse(code = 400, message = "bad request (may be user not available)") })
    @RequestMapping(value = "/login/{username}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<LoginInformation> updateLoginInformation(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Login inforation object that needs to be update" ,required=true )  @Valid @RequestBody LoginInformation body);



    @ApiOperation(value = "delete all the login infromation", nickname = "deleteloginInformation", notes = "this is delete function", tags={ "login information", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "information deleted.."),
            @ApiResponse(code = 404, message = "no login information available in DB") })
    @RequestMapping(value = "/login",
            produces = { "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAllLoginInformation();


    @ApiOperation(value = "get username and role information.", nickname = "getAllUserWithRole", notes = "Returns login information.", response = UserWithRole.class, tags={ "login information", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = UserWithRole.class),
            @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/userAndRole",
            produces = { "application/json" },
            method = RequestMethod.GET)
ResponseEntity<List<UserWithRole>> getAllMeal();

}
