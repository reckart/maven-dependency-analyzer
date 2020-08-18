package org.apache.maven.shared.dependency.analyzer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.IOException;
import java.net.URL;
import java.util.Set;

/**
 * Gets the set of classes referenced by a library given either as a jar file or an exploded directory.
 *
 * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a>
 */
public interface DependencyAnalyzer
{
    /** Constant <code>ROLE="DependencyAnalyzer.class.getName()"</code> */
    @Deprecated
    String ROLE = DependencyAnalyzer.class.getName();

    /**
     * <p>analyze.</p>
     *
     * @param url a {@link java.net.URL} object.
     * @return a {@link java.util.Set} object.
     * @throws java.io.IOException if any.
     */
    Set<String> analyze( URL url )
        throws IOException;
}
