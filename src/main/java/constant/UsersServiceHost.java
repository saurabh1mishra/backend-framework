package constant;

import properties.PropertiesReader;

public class UsersServiceHost {

    public static final String USERNAME = "username";
    private static final PropertiesReader propertiesReader = new PropertiesReader();
    private static final String host = propertiesReader.getHost();
    public static final String CREATE_USER = String.format("%s/v2/user/createWithArray", host);
    public static final String UPDATE_USER = String.format("%s/user/{username}", host);
    public static final String GET_USER = String.format("%s/user/{username}", host);

}
