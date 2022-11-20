package testSuite;

import client.users.UsersClient;
import entities.Users.UsersRequest;
import entities.Users.UsersResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class UserTest extends BaseTest {

    UsersClient usersClient;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        this.usersClient = new UsersClient();
    }

    @Test(groups = {"USERS"})
    public void createUserTest() {
        UsersRequest userRequest = UsersRequest.builder()
                .id(testHelper.randomNumber(10))
                .username(faker.name().username())
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(String.format("%s.%s@dummy.com", faker.name().firstName(), faker.name().lastName()))
                .phone(faker.phoneNumber().cellPhone())
                .password(faker.name().username())
                .build();
        List<UsersRequest> userRequestList = new ArrayList<>();
        UsersResponse response = usersClient.createUser(userRequestList);
        response.assertHttpStatusToBe(200);
    }
}
