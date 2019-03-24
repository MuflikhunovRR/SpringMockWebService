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
public class StatusRule {
    @JsonView
    private String code;
    @JsonView
    private String desc;
}
