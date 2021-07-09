package org.apache.spark.sql.execution.streaming.state;
/** Class to represent stats from each commit. */
public  class RocksDBMetrics implements scala.Product, scala.Serializable {
  static public  java.lang.Object format ()  { throw new RuntimeException(); }
  public  long numCommittedKeys ()  { throw new RuntimeException(); }
  public  long numUncommittedKeys ()  { throw new RuntimeException(); }
  public  long memUsageBytes ()  { throw new RuntimeException(); }
  public  long totalSSTFilesBytes ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, org.apache.spark.sql.execution.streaming.state.RocksDBNativeHistogram> nativeOpsLatencyMicros ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, java.lang.Object> lastCommitLatencyMs ()  { throw new RuntimeException(); }
  public  long filesCopied ()  { throw new RuntimeException(); }
  public  long bytesCopied ()  { throw new RuntimeException(); }
  public  long filesReused ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> zipFileBytesUncompressed ()  { throw new RuntimeException(); }
  // not preceding
  public   RocksDBMetrics (long numCommittedKeys, long numUncommittedKeys, long memUsageBytes, long totalSSTFilesBytes, scala.collection.Map<java.lang.String, org.apache.spark.sql.execution.streaming.state.RocksDBNativeHistogram> nativeOpsLatencyMicros, scala.collection.Map<java.lang.String, java.lang.Object> lastCommitLatencyMs, long filesCopied, long bytesCopied, long filesReused, scala.Option<java.lang.Object> zipFileBytesUncompressed)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
