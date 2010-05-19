/*
 * Copyright 2003 - 2010 The eFaps Team
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
 *
 * Revision:        $Rev$
 * Last Changed:    $Date$
 * Last Changed By: $Author$
 */

package org.slf4j.impl;

import org.efaps.maven.logger.SLF4JOverMavenLog;
import org.efaps.maven.logger.SLF4JOverMavenLogFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * @author The eFasp Team
 * @version $Id$
 */
public class StaticLoggerBinder
    implements LoggerFactoryBinder
{

    public static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    private final ILoggerFactory loggerFactory;

    private static final String loggerFactoryClassStr;

    private StaticLoggerBinder()
    {
        this.loggerFactory = new SLF4JOverMavenLogFactory();
    }

    static {
        loggerFactoryClassStr = (SLF4JOverMavenLog.class).getName();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.spi.LoggerFactoryBinder#getLoggerFactory()
     */
    public ILoggerFactory getLoggerFactory()
    {
        return this.loggerFactory;
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.spi.LoggerFactoryBinder#getLoggerFactoryClassStr()
     */
    public String getLoggerFactoryClassStr()
    {
        return StaticLoggerBinder.loggerFactoryClassStr;
    }

    /**
     * Return the singleton of this class.
     * @return the StaticLoggerBinder singleton
     */
    public static StaticLoggerBinder getSingleton()
    {
        return StaticLoggerBinder.SINGLETON;
    }
}
