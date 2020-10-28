package com.weirdduke.java15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextBlocks {

    @Test
    void firstTextBlockExample() {
        String expexted = "Old School\n" +
                "   multiline String.";
        String actual= "";
        assertEquals(expexted,actual);
    }

    @Test
    void secondTextBlockExample() {
        String expected = "SELECT * FROM PERSON " +
                "WHERE name=\"Duke\"";
        String actual= """
                SELECT * FROM PERSON \
                WHERE name="Duke"\
                """;
        assertEquals(expected,actual);
    }

    @Test
    void executeJavaScript() {
        String script = """
                function helloDuke(name) {
                    return "Hello " + name;
                }
                helloDuke(name);
                """;
        assertEquals("Hello Duke", Runner.greet(script,"Duke"));
    }
}
