package com.devsuperior.dscatalog.entities;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String name;

  public Category() {
  }

  public Category(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Category id(Long id) {
    setId(id);
    return this;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category name(String name) {
    setName(name);
    return this;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    if (!(obj instanceof Category)) {
      return false;
    }
    Category category = (Category) obj;
    return Objects.equals(id, category.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

}
