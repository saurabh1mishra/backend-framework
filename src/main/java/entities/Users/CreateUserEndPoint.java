package entities.Users;

import constant.UsersServiceHost;
import core.template.HttpMethod;
import core.template.IServiceEndpoint;
import core.template.Param;
import core.template.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class CreateUserEndPoint implements IServiceEndpoint {
    List<UsersRequest> listUsersRequest;

    public CreateUserEndPoint(List<UsersRequest> listUsersRequest) {
        this.listUsersRequest = listUsersRequest;
    }

    @Override
    public String url() {
        return UsersServiceHost.CREATE_USER;
    }

    @Override
    public HttpMethod httpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public List<Param> queryParameters() {
        return null;
    }

    @Override
    public List<Param> pathParameters() {
        return null;
    }

    @Override
    public List<Param> headers() {
        List<Param> headers = new ArrayList<>();
        headers.add(new Param("Content-Type", "application/json"));
        headers.add(new Param("accept", "application/json"));
        return headers;
    }

    @Override
    public RequestBody body() {
        return new RequestBody(UsersRequest.class, listUsersRequest);
    }
}
