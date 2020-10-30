package com.weirdduke.java15;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextBlocks {

    @Test
    void firstTextBlockExample() {
        String expexted = "Old School\n" +
                "   multiline String.";
        String actual= """
            Old School
               multiline String.""";
        assertEquals(expexted,actual);
    }

    @Test
    void secondTextBlockExample() {

        String expected = "SELECT * FROM PERSON " +
                "WHERE name=\"Duke\"";
        //language=MySQL
        String actual= """
                SELECT * FROM PERSON \
                WHERE name="Duke"\
                """;
        assertEquals(expected,actual);
    }

    @Test
    void textBlockWithParameters() {
        String name = "Jane";
        String expected = "SELECT * FROM PERSON " +
            "WHERE name=\""+name+"\"";
        String actual= """
                SELECT * FROM PERSON \
                WHERE name="{0}"\
                """;
        assertEquals(expected, MessageFormat.format(actual,name));
    }

    @Test
    void executeJavaScript() {
        //language=JavaScript
        String script = """
                function helloDuke(name) {
                    return "Hello " + name;
                }
                helloDuke(name);
                """;
        assertEquals("Hello Duke", Runner.greet(script,"Duke"));
    }


}
