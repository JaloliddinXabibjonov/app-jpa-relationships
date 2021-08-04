package uz.pdp.appjparelationships.payload;

import lombok.Data;

import java.util.*;

@Data
public class StudentDto {
    private String firstName;
    private String lastName;
    private String city;
    private String district;
    private String street;
    private Integer groupId;
    private List<Integer> subjectList;
}
