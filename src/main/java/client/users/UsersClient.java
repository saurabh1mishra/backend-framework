package client.users;

import core.apiEngine.BaseClient;
import core.apiEngine.IRestResponse;
import core.apiEngine.RequestHandler;
import entities.Users.CreateUserEndPoint;
import entities.Users.UsersRequest;
import entities.Users.UsersResponse;

import java.util.List;

public class UsersClient extends BaseClient {

    public IRestResponse<UsersResponse> createUser(List<UsersRequest> usersRequest) {
        CreateUserEndPoint createUserEndPoint = new CreateUserEndPoint(usersRequest);
        IRestResponse usersResponse = new RequestHandler().processAPIRequest(UsersResponse.class, createUserEndPoint);
        return usersResponse;
    }
}
