package com.xxjz.sc.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "poem")
public class Poem {
    String name ;
    String content ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
