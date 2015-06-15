/* Copyright 2014 Message Systems, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this software except in compliance with the License.
 *
 * A copy of the License is located at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * or in the "license" file accompanying this software. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.messagesystems.sparkpostsdk;

import java.util.Map;

/** DTO for storing a template.
 *
 * @author grava
 */
public class SPDTOTemplate extends SPDTOBase {

    public String id = null;
    public SPDTOTemplateContent content = null ;
    public Boolean published = null ;
    public String name = null;
    public String description = null;
    public SPDTOTemplateOptions options = null ;

}
