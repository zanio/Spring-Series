package com.example.demo.springComponentScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJDBC componentJDBC;

    public ComponentDAO(ComponentJDBC componentJDBC) {
        this.componentJDBC = componentJDBC;
    }

    public ComponentJDBC getComponentJDBC() {
        return componentJDBC;
    }
}
