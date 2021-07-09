package org.apache.spark;
/**
 * Arithmetic exception thrown from Spark with an error class.
 */
public  class SparkArithmeticException extends java.lang.ArithmeticException implements org.apache.spark.SparkThrowable {
  public   SparkArithmeticException (java.lang.String errorClass, java.lang.String[] messageParameters)  { throw new RuntimeException(); }
  public  java.lang.String getErrorClass ()  { throw new RuntimeException(); }
  public  java.lang.String getSqlState ()  { throw new RuntimeException(); }
}
