package org.apache.hadoop.hbase.regionserver.skiplist.hbase;

import org.apache.hadoop.hbase.regionserver.MemStoreSize;
import org.apache.hadoop.hbase.regionserver.MemStoreSizeForCCSMap;
import org.apache.hadoop.hbase.regionserver.MemStoreSizing;

/**
 * @Description: Reference from NonThreadSafeMemStoreSizing
 * @Author: XiongCheng
 * @CreateDate: 2019/7/22-14:53
 * @Version:1.0
 */
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
