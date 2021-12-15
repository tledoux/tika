/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tika.parser.microsoft.onenote.fsshttpb.streamobj.basic;

import java.util.Arrays;
import java.util.UUID;

import org.apache.tika.parser.microsoft.onenote.fsshttpb.util.SequenceNumberGenerator;

/**
 * Data Node Object data
 */
public class DataNodeObjectData {
    public ExGuid exGuid;
    public byte[] objectData;

    /**
     * Initializes a new instance of the DataNodeObjectData class.
     *
     * @param byteArray  A Byte array
     * @param startIndex Start position
     * @param length     The element length
     */
    public DataNodeObjectData(byte[] byteArray, int startIndex, int length) {
        this();
        this.objectData = Arrays.copyOfRange(byteArray, startIndex, length);

    }

    /**
     * Initializes a new instance of the DataNodeObjectData class.
     */
    DataNodeObjectData() {
        this.exGuid =
                new ExGuid(SequenceNumberGenerator.GetCurrentSerialNumber(), UUID.randomUUID());
    }
}
