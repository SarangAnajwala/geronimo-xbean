/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xbean.terminal.telnet;

public class TelnetOption {

    private int optionCode;
    private boolean supported;
    private boolean enabled;
    private boolean negotiated;
    private boolean inNegotiation;

    public TelnetOption(int optionCode) {
        this.optionCode = optionCode;
    }

    public int getOptionId() {
        return optionCode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        negotiated = true;
    }

    public void disable() {
        enabled = false;
        negotiated = true;
    }

    public boolean isSupported() {
        return supported;
    }

    public boolean isInNegotiation() {
        return inNegotiation;
    }

    public void isInNegotiation(boolean inNegotiation) {
        this.inNegotiation = inNegotiation;
    }

    public boolean hasBeenNegotiated() {
        return negotiated;
    }

    public void hasBeenNegotiated(boolean negotiated) {
        this.negotiated = negotiated;
        this.inNegotiation = false;
    }
}
