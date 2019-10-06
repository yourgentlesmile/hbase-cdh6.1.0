/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver.skiplist.hbase;

import org.apache.hadoop.hbase.regionserver.MemStoreSize;
import org.apache.hadoop.hbase.regionserver.MemStoreSizeForCCSMap;
import org.apache.hadoop.hbase.regionserver.MemStoreSizing;

/**
 * Reference from NonThreadSafeMemStoreSizing
 */
@InterfaceAudience.Private
class NonThreadSafeMemStoreSizingForCCSMap implements MemStoreSizing {
    private long dataSize = 0;
    private long heapSize = 0;
    private long offHeapSize = 0;

    NonThreadSafeMemStoreSizingForCCSMap() {
        this(0, 0, 0);
    }

    NonThreadSafeMemStoreSizingForCCSMap(MemStoreSize mss) {
        this(mss.getDataSize(), mss.getHeapSize(), mss.getOffHeapSize());
    }

    NonThreadSafeMemStoreSizingForCCSMap(long dataSize, long heapSize, long offHeapSize) {
        incMemStoreSize(dataSize, heapSize, offHeapSize);
    }

    @Override
    public MemStoreSize getMemStoreSize() {
        return new MemStoreSizeForCCSMap(this.dataSize, this.heapSize, this.offHeapSize);
    }

    @Override
    public long incMemStoreSize(long dataSizeDelta, long heapSizeDelta,
                                long offHeapSizeDelta) {
        this.offHeapSize += offHeapSizeDelta;
        this.heapSize += heapSizeDelta;
        this.dataSize += dataSizeDelta;
        return this.dataSize;
    }

    @Override
    public long getDataSize() {
        return dataSize;
    }

    @Override
    public long getHeapSize() {
        return heapSize;
    }

    @Override
    public long getOffHeapSize() {
        return offHeapSize;
    }

    @Override
    public String toString() {
        return getMemStoreSize().toString();
    }
}
