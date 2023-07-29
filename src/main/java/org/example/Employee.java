package org.example;

import java.util.List;

public record Employee(Integer id, String name, String mobile, List<String> designation, Double salary) {
    public Employee(){this(0,null,null,null,null);}


}
