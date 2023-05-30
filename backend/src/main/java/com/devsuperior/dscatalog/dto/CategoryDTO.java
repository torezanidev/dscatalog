package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

import jakarta.annotation.Generated;

public class CategoryDTO implements Serializable {

  private Long id;
  private String name;

  public CategoryDTO() {
  }

  public CategoryDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public CategoryDTO(Category entity) {
    this.id = entity.getId();
    this.name = entity.getName();
  }

  @Generated("sohibe.vscode")
  public Long getId() {
    return this.id;
  }

  @Generated("sohibe.vscode")
  public void setId(Long id) {
    this.id = id;
  }

  @Generated("sohibe.vscode")
  public CategoryDTO id(Long id) {
    setId(id);
    return this;
  }

  @Generated("sohibe.vscode")
  public String getName() {
    return this.name;
  }

  @Generated("sohibe.vscode")
  public void setName(String name) {
    this.name = name;
  }

  @Generated("sohibe.vscode")
  public CategoryDTO name(String name) {
    setName(name);
    return this;
  }

}
