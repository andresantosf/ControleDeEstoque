package com.alm.crudspring.exception;

public class RecordNotFoundException extends RuntimeException {

  public RecordNotFoundException(Long id) {
    super("Registro não encontrado com id: " + id);
  }
}
