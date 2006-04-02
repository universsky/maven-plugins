/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.maven.plugin.eclipse;

import java.util.Properties;

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 * @author <a href="mailto:fgiust@apache.org">Fabrizio Giustina</a>
 * @version $Id$
 */
public class EclipsePluginTest
    extends AbstractEclipsePluginTestCase
{
    public void testProject1()
        throws Exception
    {
        testProject( "project-1" );
    }

    public void testProject2()
        throws Exception
    {
        testProject( "project-2" );
    }

    public void testProject3()
        throws Exception
    {
        testProject( "project-3" );
    }

    public void testProject4()
        throws Exception
    {
        testProject( "project-4" );
    }

    public void testProject5()
        throws Exception
    {
        testProject( "project-5" );
    }

    public void testProject6()
        throws Exception
    {
        testProject( "project-6" );
    }

    // @todo temporary disabled, since it randomically fails due to a different order for dependencies in classpath and
    // wtpmodules. This is not a problem, since order could be ignored in this test, but we should rewrite the file-comparing
    // step which at the moment just does line by line comparison
    //    public void testProject7()
    //        throws Exception
    //    {
    //        testProject( "project-7" );
    //    }

    public void testProject8()
        throws Exception
    {
        testProject( "project-8" );
    }

    public void testProject9()
        throws Exception
    {
        testProject( "project-9" );
    }

    public void testProject10()
        throws Exception
    {
        testProject( "project-10" );
    }

    public void testProject11()
        throws Exception
    {
        testProject( "project-11" );
    }

    /**
     * Test with ear project
     * @throws Exception any exception thrown during test
     */
    public void testProject12()
        throws Exception
    {
        testProject( "project-12" );
    }

}
