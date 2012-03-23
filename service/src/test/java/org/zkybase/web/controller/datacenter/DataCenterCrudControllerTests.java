/* 
 * DataCenterControllerTests.java
 * 
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zkybase.web.controller.datacenter;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.mockito.Mock;
import org.zkybase.model.DataCenter;
import org.zkybase.model.Region;
import org.zkybase.service.DataCenterService;
import org.zkybase.service.RegionService;
import org.zkybase.web.controller.AbstractCrudControllerTests;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public class DataCenterCrudControllerTests extends AbstractCrudControllerTests<DataCenter> {
	
	// Dependencies
	@Mock private DataCenterService dataCenterService;
	@Mock private RegionService regionService;
	
	// Test objects
	@Mock private DataCenter dataCenter;
	
	/* (non-Javadoc)
	 * @see org.zkybase.web.controller.AbstractCrudControllerTests#doSetUp()
	 */
	@Override
	protected void doSetUp() throws Exception {
		when(dataCenterService.findOne(anyLong())).thenReturn(dataCenter);
		when(regionService.findAll()).thenReturn(new ArrayList<Region>());
	}
}