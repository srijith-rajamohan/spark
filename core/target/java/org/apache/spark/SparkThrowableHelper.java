package org.apache.spark;
/**
 * Companion object used by instances of {@link SparkThrowable} to access error class information and
 * construct error messages.
 */
public  class SparkThrowableHelper {
  static public  java.net.URL errorClassesUrl ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.SortedMap<java.lang.String, org.apache.spark.ErrorInfo> errorClassToInfoMap ()  { throw new RuntimeException(); }
  static public  java.lang.String getMessage (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  static public  java.lang.String getSqlState (java.lang.String errorClass)  { throw new RuntimeException(); }
}
