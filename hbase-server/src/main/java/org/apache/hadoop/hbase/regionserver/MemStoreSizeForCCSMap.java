package org.apache.hadoop.hbase.regionserver;


/**
 * @Description:
 * @Author: XiongCheng
 * @CreateDate: 2019/7/22-14:57
 * @Version:1.0
 */
public class MemStoreSizeForCCSMap extends MemStoreSize {
    public MemStoreSizeForCCSMap() {
        super();
    }

    public MemStoreSizeForCCSMap(long dataSize, long heapSize, long offHeapSize) {
        super(dataSize, heapSize, offHeapSize);
    }

    public MemStoreSizeForCCSMap(MemStoreSize memStoreSize) {
        super(memStoreSize);
    }
}
