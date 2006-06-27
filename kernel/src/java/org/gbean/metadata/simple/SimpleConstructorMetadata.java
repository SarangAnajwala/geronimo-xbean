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
package org.gbean.metadata.simple;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.gbean.kernel.ConstructorSignature;
import org.gbean.metadata.ConstructorMetadata;
import org.gbean.metadata.ParameterMetadata;

/**
 * @version $Revision$ $Date$
 */
public class SimpleConstructorMetadata implements ConstructorMetadata {
    private final Map properties = new LinkedHashMap();
    private final Constructor constructor;
    private final ConstructorSignature signature;
    private final List parameterMetadata;

    public SimpleConstructorMetadata(Constructor constructor) {
        this.constructor = constructor;
        this.signature = new ConstructorSignature(constructor);
        Class[] parameterTypes = constructor.getParameterTypes();
        List parameters = new ArrayList(parameterTypes.length);
        for (int i = 0; i < parameterTypes.length; i++) {
            Class parameterType = constructor.getParameterTypes()[i];
            parameters.add(new SimpleParameterMetadata(i, parameterType));
        }
        parameterMetadata = Collections.unmodifiableList(parameters);
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public ConstructorSignature getSignature() {
        return signature;
    }

    public List getParameters() {
        return parameterMetadata;
    }

    public ParameterMetadata getParameter(int index) {
        return (ParameterMetadata) parameterMetadata.get(index);
    }

    public Map getProperties() {
        return properties;
    }

    public Object get(Object key) {
        return properties.get(key);
    }

    public Object put(Object key, Object value) {
        return properties.put(key, value);
    }

    public Object remove(Object key) {
        return properties.remove(key);
    }
}