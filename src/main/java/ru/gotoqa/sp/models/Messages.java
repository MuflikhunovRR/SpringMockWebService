package ru.gotoqa.sp.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Muflikhunov Roman
 */

@Getter
@Setter
@ToString
public class Messages {
    @JsonView
    private String id;
    @JsonView
    private String type;
    @JsonView
    private String cardNumbers;
}
