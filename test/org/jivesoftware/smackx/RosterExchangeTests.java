/**
 * $RCSfile$
 * $Revision: 13459 $
 * $Date: 2013-02-07 19:10:22 +0000 (Thu, 07 Feb 2013) $
 *
 * Copyright 2003-2007 Jive Software.
 *
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
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

package org.jivesoftware.smackx;

import org.jivesoftware.smackx.packet.RosterExchangeTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 *
 * Test suite that runs all the Roster Exchange extension tests
 *
 * @author Gaston Dombiak
 */
public class RosterExchangeTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("High and low level API tests for roster exchange extension");
        //$JUnit-BEGIN$
        suite.addTest(new TestSuite(RosterExchangeManagerTest.class));
        suite.addTest(new TestSuite(RosterExchangeTest.class));
        //$JUnit-END$
        return suite;
    }
}
