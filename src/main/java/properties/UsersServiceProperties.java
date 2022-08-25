package properties;

public class UsersServiceProperties {

    public static final String USERNAME = "username";
    private static final PropertiesReader propertiesReader = new PropertiesReader();
    private static final String host = propertiesReader.getHost();

    public static final String CREATE_USER = String.format("%s/user/createWithArray", host);

    public static final String UPDATE_USER = String.format("%s/user/{username}", host);

    public static final String GET_USER = String.format("%s/user/{username}", host);

}
