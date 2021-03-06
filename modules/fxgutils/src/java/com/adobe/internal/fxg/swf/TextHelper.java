/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.adobe.internal.fxg.swf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utilities to help create Text.
 * 
 */
public class TextHelper
{
    protected static Pattern whitespacePattern = Pattern.compile ("(\\s+)");
    
	/**
	 * Determine if a string contains only ignorable white spaces.
	 * 
	 * @param value - value to be checked.
	 * @return true if value contains only ignorable white spaces, else, return false.
	 */
	public static boolean ignorableWhitespace(String value)
    {
        Matcher m;

        m = whitespacePattern.matcher(value);
        if (m.matches ())
            return true; 
        else
            return false;
    }
	
}
