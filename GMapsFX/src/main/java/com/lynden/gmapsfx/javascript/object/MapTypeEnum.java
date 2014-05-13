/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lynden.gmapsfx.javascript.object;

import com.lynden.gmapsfx.javascript.JavascriptEnum;

/**
 *
 * @author Rob Terpilowski
 */
public class MapTypeEnum extends JavascriptEnum {

    public static String MAP_ENUM = "google.maps.MapTypeId";
    
    public static MapTypeEnum TERRAIN = new MapTypeEnum( "TERRAIN" );
    public static MapTypeEnum ROADMAP = new MapTypeEnum( "ROADMAP" );
    public static MapTypeEnum SATELLITE = new MapTypeEnum( "SATELLITE" );
    public static MapTypeEnum HYBRID = new MapTypeEnum( "HYBRID" );
    
    protected MapTypeEnum( String value) {
        super(MAP_ENUM, value);
    }
    
    
    
}
