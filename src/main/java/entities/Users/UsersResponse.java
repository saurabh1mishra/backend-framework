package entities.Users;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import core.template.BaseResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersResponse extends BaseResponse {
    @JsonProperty("code")
    public Integer code;
    @JsonProperty("type")
    public String type;
    @JsonProperty("message")
    public String message;
}
