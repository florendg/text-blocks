package com.weirdduke.java15;

import org.graalvm.polyglot.Context;

public class Runner {

    static String greet(String script, String name){
        try(var jsContext= Context.create("js")) {
            var bindings = jsContext.getBindings("js");
            bindings.putMember("name",name);
            return jsContext.eval("js",script).asString();
        }
    }
}
