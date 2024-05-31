package com.hr;

/*
 * more HR oriented, higher-leve exception type
 * that this other loq-level transportation DestinationUnreachableException
 */
public class WorkException extends Exception {

  public WorkException() {
  }

  public WorkException(String message) {
    super(message);
  }

  public WorkException(String message, Throwable cause) {
    super(message, cause);
  }

  public WorkException(Throwable cause) {
    super(cause);
  }
}