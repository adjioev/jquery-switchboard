/* Copyright (c) 2009 Government of the State of New South Wales 
 *                    Through the Department of Environment and Climate Change
 * All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.lisasoft.mer;

import java.io.InputStream;

import org.geoserver.wfs.WFSTestSupport;
import org.w3c.dom.Document;


public class UnprocessedHierarchicalJSONOutputFormatTest extends AbstractOutputFormatTest {
    
    public void testUnprocessedHirerchicalOutputFormat() throws Exception {
    	testOutputFormatType("hier-json");
    }
   
}
