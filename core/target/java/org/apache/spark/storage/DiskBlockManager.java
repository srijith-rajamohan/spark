package org.apache.spark.storage;
/**
 * Creates and maintains the logical mapping between logical blocks and physical on-disk
 * locations. One block is mapped to one file with a name given by its BlockId.
 * <p>
 * Block files are hashed among the directories listed in spark.local.dir (or in
 * SPARK_LOCAL_DIRS, if it's set).
 * <p>
 * ShuffleDataIO also can change the behavior of deleteFilesOnStop.
 */
  class DiskBlockManager implements org.apache.spark.internal.Logging {
  static   java.lang.String MERGE_MANAGER_DIR ()  { throw new RuntimeException(); }
  public  boolean deleteFilesOnStop ()  { throw new RuntimeException(); }
  // not preceding
  public   DiskBlockManager (org.apache.spark.SparkConf conf, boolean deleteFilesOnStop)  { throw new RuntimeException(); }
    int subDirsPerLocalDir ()  { throw new RuntimeException(); }
    java.io.File[] localDirs ()  { throw new RuntimeException(); }
    java.lang.String[] localDirsString ()  { throw new RuntimeException(); }
  /** Looks up a file by hashing it into one of our local subdirectories. */
  public  java.io.File getFile (java.lang.String filename)  { throw new RuntimeException(); }
  public  java.io.File getFile (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * This should be in sync with
   * @see {@link org.apache.spark.network.shuffle.RemoteBlockPushResolver#getFile(
   *     java.lang.String, java.lang.String)}
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  java.io.File getMergedShuffleFile (org.apache.spark.storage.BlockId blockId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /** Check if disk block manager has a block. */
  public  boolean containsBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** List all the files currently stored on disk by the disk manager. */
  public  scala.collection.Seq<java.io.File> getAllFiles ()  { throw new RuntimeException(); }
  /** List all the blocks currently stored on disk by the disk manager. */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getAllBlocks ()  { throw new RuntimeException(); }
  /** Produces a unique block id and File suitable for storing local intermediate results. */
  public  scala.Tuple2<org.apache.spark.storage.TempLocalBlockId, java.io.File> createTempLocalBlock ()  { throw new RuntimeException(); }
  /** Produces a unique block id and File suitable for storing shuffled intermediate results. */
  public  scala.Tuple2<org.apache.spark.storage.TempShuffleBlockId, java.io.File> createTempShuffleBlock ()  { throw new RuntimeException(); }
  /**
   * Create a directory that is writable by the group.
   * Grant the permission 770 "rwxrwx---" to the directory so the shuffle server can
   * create subdirs/files within the merge folder.
   * TODO: Find out why can't we create a dir using java api with permission 770
   *  Files.createDirectories(mergeDir.toPath, PosixFilePermissions.asFileAttribute(
   *  PosixFilePermissions.fromString("rwxrwx---")))
   * @param dirToCreate (undocumented)
   */
  public  void createDirWithPermission770 (java.io.File dirToCreate)  { throw new RuntimeException(); }
  /** Cleanup local dirs and stop shuffle sender. */
    void stop ()  { throw new RuntimeException(); }
}
