/*
 * Copyright (C) 2015 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.scan;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opendatakit.scan.utils.ScanUtils;
import org.opendatakit.utilities.ODKFileUtils;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ScanUtilsTest {
  private static final String APP_NAME = ODKFileUtils.getOdkDefaultAppName();

  @Test
  public void testValuesMatch() {
    String appName = ScanUtils.getODKAppName();
    assertEquals(appName, APP_NAME);
  }

}
