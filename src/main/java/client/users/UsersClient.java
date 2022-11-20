package client.users;

import client.BaseClient;
import core.utils.RequestHandler;
import entities.Users.CreateUserEndPoint;
import entities.Users.UsersRequest;
import entities.Users.UsersResponse;
import io.restassured.response.Response;

import java.util.List;

public class UsersClient extends BaseClient {

    public UsersResponse createUser(List<UsersRequest> usersRequest) {
        CreateUserEndPoint createUserEndPoint = new CreateUserEndPoint(usersRequest);
        Response response = new RequestHandler().processRequest(createUserEndPoint);
        UsersResponse usersResponse = new UsersResponse();
        if (!response.getBody().asString().isEmpty()) usersResponse = response.as(UsersResponse.class);
        usersResponse.setHttpStatusCode(response.statusCode());

        return usersResponse;
    }
}
