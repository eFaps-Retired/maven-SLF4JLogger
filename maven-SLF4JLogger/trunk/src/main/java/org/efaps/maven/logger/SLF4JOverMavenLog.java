/*
 * Copyright 2003 - 2009 The eFaps Team
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

package org.efaps.maven.logger;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;

/**
 * This Class converts the Maven internal Logger to an "Apache Commmons logger." <br/>
 * Therefore the standard logger definition used in eFaps can be used for the
 * Maven Mojo also.
 *
 * @author tmo
 * @version $Id$
 */
public class SLF4JOverMavenLog
    implements Logger
{

    public static org.apache.maven.plugin.logging.Log LOGGER;

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#getName()
     */
    public String getName()
    {
        // TODO Auto-generated method stub
        return null;
    }

    // Is debug logging currently enabled?
    public boolean isDebugEnabled()
    {
        return SLF4JOverMavenLog.LOGGER.isDebugEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#isDebugEnabled(org.slf4j.Marker)
     */
    public boolean isDebugEnabled(final Marker _marker)
    {
        return SLF4JOverMavenLog.LOGGER.isDebugEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(java.lang.String)
     */
    public void debug(final String _text)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object)
     */
    public void debug(final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object[])
     */
    public void debug(final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Throwable)
     */
    public void debug(final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String)
     */
    public void debug(final Marker _marker,
                      final String _text)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object,
     * java.lang.Object)
     */
    public void debug(final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String,
     * java.lang.Object)
     */
    public void debug(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String,
     * java.lang.Object[])
     */
    public void debug(final Marker _marker,
                      final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String,
     * java.lang.Throwable)
     */
    public void debug(final Marker _marker,
                      final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String,
     * java.lang.Object, java.lang.Object)
     */
    public void debug(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

       // Is error logging currently enabled?
    public boolean isErrorEnabled()
    {
        return SLF4JOverMavenLog.LOGGER.isErrorEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#isErrorEnabled(org.slf4j.Marker)
     */
    public boolean isErrorEnabled(final Marker _marker)
    {
        return SLF4JOverMavenLog.LOGGER.isErrorEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(java.lang.String)
     */
    public void error(final String _text)
    {
        SLF4JOverMavenLog.LOGGER.error(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object)
     */
    public void error(final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object[])
     */
    public void error(final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(java.lang.String, java.lang.Throwable)
     */
    public void error(final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.error(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String)
     */
    public void error(final Marker _marker,
                      final String _text)
    {
        SLF4JOverMavenLog.LOGGER.error(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object,
     * java.lang.Object)
     */
    public void error(final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String,
     * java.lang.Object)
     */
    public void error(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String,
     * java.lang.Object[])
     */
    public void error(final Marker _marker,
                      final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String,
     * java.lang.Throwable)
     */
    public void error(final Marker _marker,
                      final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.error(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String,
     * java.lang.Object, java.lang.Object)
     */
    public void error(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.error(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    // Is info logging currently enabled?
    public boolean isInfoEnabled()
    {
        return SLF4JOverMavenLog.LOGGER.isInfoEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#isInfoEnabled(org.slf4j.Marker)
     */
    public boolean isInfoEnabled(final Marker _marker)
    {
        return SLF4JOverMavenLog.LOGGER.isInfoEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(java.lang.String)
     */
    public void info(final String _text)
    {
        SLF4JOverMavenLog.LOGGER.info(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object)
     */
    public void info(final String _messagePattern,
                     final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object[])
     */
    public void info(final String _messagePattern,
                     final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(java.lang.String, java.lang.Throwable)
     */
    public void info(final String _text,
                     final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.info(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String)
     */
    public void info(final Marker _marker,
                     final String _text)
    {
        SLF4JOverMavenLog.LOGGER.info(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object,
     * java.lang.Object)
     */
    public void info(final String _messagePattern,
                     final Object _arg1,
                     final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String,
     * java.lang.Object)
     */
    public void info(final Marker _marker,
                     final String _messagePattern,
                     final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String,
     * java.lang.Object[])
     */
    public void info(final Marker _marker,
                     final String _messagePattern,
                     final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String,
     * java.lang.Throwable)
     */
    public void info(final Marker _marker,
                     final String _text,
                     final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.info(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String,
     * java.lang.Object, java.lang.Object)
     */
    public void info(final Marker _marker,
                     final String _messagePattern,
                     final Object _arg1,
                     final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.info(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    // ///////////////////////////////////////////////////////////////////////////
    // trace => debug

    // Is trace logging currently enabled?
    public boolean isTraceEnabled()
    {
        return SLF4JOverMavenLog.LOGGER.isDebugEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#isTraceEnabled(org.slf4j.Marker)
     */
    public boolean isTraceEnabled(final Marker _marker)
    {
        return SLF4JOverMavenLog.LOGGER.isDebugEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(java.lang.String)
     */
    public void trace(final String _text)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object)
     */
    public void trace(final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object[])
     */
    public void trace(final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Throwable)
     */
    public void trace(final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String)
     */
    public void trace(final Marker _marker,
                      final String _text)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object,
     * java.lang.Object)
     */
    public void trace(final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String,
     * java.lang.Object)
     */
    public void trace(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String,
     * java.lang.Object[])
     */
    public void trace(final Marker _marker,
                      final String _messagePattern,
                      final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String,
     * java.lang.Throwable)
     */
    public void trace(final Marker _marker,
                      final String _text,
                      final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.debug(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String,
     * java.lang.Object, java.lang.Object)
     */
    public void trace(final Marker _marker,
                      final String _messagePattern,
                      final Object _arg1,
                      final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.debug(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    // ///////////////////////////////////////////////////////////////////////////
    // warn

    // Is warn logging currently enabled?
    public boolean isWarnEnabled()
    {
        return SLF4JOverMavenLog.LOGGER.isWarnEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#isWarnEnabled(org.slf4j.Marker)
     */
    public boolean isWarnEnabled(final Marker _marker)
    {
        return SLF4JOverMavenLog.LOGGER.isWarnEnabled();
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(java.lang.String)
     */
    public void warn(final String _text)
    {
        SLF4JOverMavenLog.LOGGER.warn(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object)
     */
    public void warn(final String _messagePattern,
                     final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object[])
     */
    public void warn(final String _messagePattern,
                     final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Throwable)
     */
    public void warn(final String _text,
                     final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.warn(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String)
     */
    public void warn(final Marker _marker,
                     final String _text)
    {
        SLF4JOverMavenLog.LOGGER.warn(_text);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object,
     * java.lang.Object)
     */
    public void warn(final String _messagePattern,
                     final Object _arg1,
                     final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String,
     * java.lang.Object)
     */
    public void warn(final Marker _marker,
                     final String _messagePattern,
                     final Object _arg)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.format(_messagePattern, _arg).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String,
     * java.lang.Object[])
     */
    public void warn(final Marker _marker,
                     final String _messagePattern,
                     final Object[] _args)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.arrayFormat(_messagePattern, _args).getMessage());
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String,
     * java.lang.Throwable)
     */
    public void warn(final Marker _marker,
                     final String _text,
                     final Throwable _e)
    {
        SLF4JOverMavenLog.LOGGER.warn(_text, _e);
    }

    /*
     * (non-Javadoc)
     * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String,
     * java.lang.Object, java.lang.Object)
     */
    public void warn(final Marker _marker,
                     final String _messagePattern,
                     final Object _arg1,
                     final Object _arg2)
    {
        SLF4JOverMavenLog.LOGGER.warn(MessageFormatter.format(_messagePattern, _arg1, _arg2).getMessage());
    }
}
