/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynden.gmapsfx.javascript;

import netscape.javascript.JSObject;

/**
 *
 * @author Rob Terpilowski
 */
public class JavascriptEnum {

    protected IJavascriptRuntime runtime;
    protected String type;
    protected String name;
    protected Object value;

    protected JavascriptEnum(String type, String name) {
        this.type = type;
        this.name = name;
        runtime = JavascriptRuntime.getInstance();

    }

    public Object getEnumValue() {
        if (value == null) {
            JSObject jsObject = runtime.execute(type);
            value = jsObject.getMember(name);
        }
        return value;
    }

}
