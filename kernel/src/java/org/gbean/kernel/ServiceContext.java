/**
 *
 * Copyright 2005 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.gbean.kernel;

/**
 * This class contains context information available to a service factory during service construction and destruction.
 *
 * @author Dain Sundstrom
 * @version $Id$
 * @since 1.0
 */
public interface ServiceContext {
    /**
     * Gets the kernel in which this service is registered.
     *
     * @return the kernel in which this service is registered
     */
    Kernel getKernel();

    /**
     * Gets the unique name of the service in the kernel.
     *
     * @return the unique name of this service in the kernel
     */
    ServiceName getServiceName();

    /**
     * Gets the class loader for this service.
     *
     * @return the class loader for this service
     */
    ClassLoader getClassLoader();
}