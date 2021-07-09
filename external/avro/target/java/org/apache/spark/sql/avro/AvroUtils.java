package org.apache.spark.sql.avro;
public  class AvroUtils {
  static public  interface RowReader {
    public  org.apache.spark.sql.avro.AvroDeserializer deserializer ()  ;
    public  org.apache.avro.file.FileReader<org.apache.avro.generic.GenericRecord> fileReader ()  ;
    public  boolean hasNextRow ()  ;
    public  org.apache.spark.sql.catalyst.InternalRow nextRow ()  ;
    public  long stopPosition ()  ;
  }
  /**
   * Wraps an Avro Schema object so that field lookups are faster.
   * <p>
   * param:  avroSchema The schema in which to search for fields. Must be of type RECORD.
   * param:  avroPath The seq of parent field names leading to <code>avroSchema</code>.
   * param:  positionalFieldMatch If true, perform field matching in a positional fashion
   *                             (structural comparison between schemas, ignoring names);
   *                             otherwise, perform field matching using field names.
   */
  static public  class AvroSchemaHelper {
    public   AvroSchemaHelper (org.apache.avro.Schema avroSchema, scala.collection.Seq<java.lang.String> avroPath, boolean positionalFieldMatch)  { throw new RuntimeException(); }
    /** Get the Avro field corresponding to the provided Catalyst field name/position, if any. */
    public  scala.Option<org.apache.avro.Schema.Field> getAvroField (java.lang.String fieldName, int catalystPos)  { throw new RuntimeException(); }
    /**
     * Extract a single field from the contained avro schema which has the desired field name,
     * performing the matching with proper case sensitivity according to SQLConf.resolver.
     * <p>
     * @param name The name of the field to search for.
     * @return <code>Some(match)</code> if a matching Avro field is found, otherwise <code>None</code>.
     */
      scala.Option<org.apache.avro.Schema.Field> getFieldByName (java.lang.String name)  { throw new RuntimeException(); }
  }
  static public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  static public  boolean supportsDataType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  /**
   * Take a field's hierarchical names (see {@link toFieldStr}) and position, and convert it to a
   * human-readable description of the field. Depending on the value of <code>positionalFieldMatch</code>,
   * either the position or name will be emphasized (for true and false, respectively); both will
   * be included in either case.
   * @param names (undocumented)
   * @param position (undocumented)
   * @param positionalFieldMatch (undocumented)
   * @return (undocumented)
   */
  static   java.lang.String toFieldDescription (scala.collection.Seq<java.lang.String> names, int position, boolean positionalFieldMatch)  { throw new RuntimeException(); }
  /**
   * Convert a sequence of hierarchical field names (like <code>Seq(foo, bar)</code>) into a human-readable
   * string representing the field, like "field 'foo.bar'". If <code>names</code> is empty, the string
   * "top-level record" is returned.
   * @param names (undocumented)
   * @return (undocumented)
   */
  static   java.lang.String toFieldStr (scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
