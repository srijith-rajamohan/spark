package org.apache.spark.shuffle;
/**
 * Create and maintain the shuffle blocks' mapping between logic block and physical file location.
 * Data of shuffle blocks from the same map task are stored in a single consolidated data file.
 * The offsets of the data blocks in the data file are stored in a separate index file.
 * <p>
 * We use the name of the shuffle data's shuffleBlockId with reduce ID set to 0 and add ".data"
 * as the filename postfix for data file, and ".index" as the filename postfix for index file.
 * <p>
 */
  class IndexShuffleBlockResolver implements org.apache.spark.shuffle.ShuffleBlockResolver, org.apache.spark.internal.Logging, org.apache.spark.shuffle.MigratableResolver {
  static public  int NOOP_REDUCE_ID ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager _blockManager ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexShuffleBlockResolver (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockManager _blockManager)  { throw new RuntimeException(); }
  public  java.io.File getDataFile (int shuffleId, long mapId)  { throw new RuntimeException(); }
  /**
   * Get the shuffle files that are stored locally. Used for block migrations.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.shuffle.ShuffleBlockInfo> getStoredShuffles ()  { throw new RuntimeException(); }
  /**
   * Get the shuffle data file.
   * <p>
   * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
   * read from the specified directories.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  java.io.File getDataFile (int shuffleId, long mapId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /**
   * Get the shuffle index file.
   * <p>
   * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
   * read from the specified directories.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  java.io.File getIndexFile (int shuffleId, long mapId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /**
   * Remove data file and index file that contain the output data from one map.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   */
  public  void removeDataByMap (int shuffleId, long mapId)  { throw new RuntimeException(); }
  /**
   * Write a provided shuffle block as a stream. Used for block migrations.
   * ShuffleBlockBatchIds must contain the full range represented in the ShuffleIndexBlock.
   * Requires the caller to delete any shuffle index blocks where the shuffle block fails to
   * put.
   * @param blockId (undocumented)
   * @param serializerManager (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.client.StreamCallbackWithID putShuffleBlockAsStream (org.apache.spark.storage.BlockId blockId, org.apache.spark.serializer.SerializerManager serializerManager)  { throw new RuntimeException(); }
  /**
   * Get the index &amp; data block for migration.
   * @param shuffleBlockInfo (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.List<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.network.buffer.ManagedBuffer>> getMigrationBlocks (org.apache.spark.shuffle.ShuffleBlockInfo shuffleBlockInfo)  { throw new RuntimeException(); }
  /**
   * Write an index file with the offsets of each block, plus a final offset at the end for the
   * end of the output file. This will be used by getBlockData to figure out where each block
   * begins and ends.
   * <p>
   * It will commit the data and index file as an atomic operation, use the existing ones, or
   * replace them with new ones.
   * <p>
   * Note: the <code>lengths</code> will be updated to match the existing index file if use the existing ones.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param lengths (undocumented)
   * @param dataTmp (undocumented)
   */
  public  void writeIndexFileAndCommit (int shuffleId, long mapId, long[] lengths, java.io.File dataTmp)  { throw new RuntimeException(); }
  /**
   * This is only used for reading local merged block data. In such cases, all chunks in the
   * merged shuffle file need to be identified at once, so the ShuffleBlockFetcherIterator
   * knows how to consume local merged shuffle file as multiple chunks.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.network.buffer.ManagedBuffer> getMergedBlockData (org.apache.spark.storage.ShuffleBlockId blockId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /**
   * This is only used for reading local merged block meta data.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.shuffle.MergedBlockMeta getMergedBlockMeta (org.apache.spark.storage.ShuffleBlockId blockId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /**
   * This is only used for reading local merged block meta data.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
