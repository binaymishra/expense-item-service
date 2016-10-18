package com.expense.item.service.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Item domain Object.
 *
 * @author Binay Mishra
 *
 */
public class Item implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  Integer id;
  String name;
  String unit;
  String itemType;
  Double perUnitCost;
  String description;
  Date dateOfCreation;
  String createdBy;
  Date lastUpdated;
  String lastUpdatedBy;

  String dateOfCreationAsString;
  String lastUpdatedAsString;

  public Item() {
	// TODO Auto-generated constructor stub
  }

  public Item(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
  }

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
	this.id = id;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getUnit() {
	return unit;
  }

  public void setUnit(String unit) {
	this.unit = unit;
  }

  public String getItemType() {
	return itemType;
  }

  public void setItemType(String itemType) {
	this.itemType = itemType;
  }

  public Double getPerUnitCost() {
	return perUnitCost;
  }

  public void setPerUnitCost(Double perUnitCost) {
	this.perUnitCost = perUnitCost;
  }

  public String getDescription() {
	return description;
  }

  public void setDescription(String description) {
	this.description = description;
  }

  public Date getDateOfCreation() {
	return dateOfCreation;
  }

  public void setDateOfCreation(Date dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
  }

  public String getCreatedBy() {
	return createdBy;
  }

  public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
  }

  public Date getLastUpdated() {
	return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
	this.lastUpdated = lastUpdated;
  }

  public String getLastUpdatedBy() {
	return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
	this.lastUpdatedBy = lastUpdatedBy;
  }

  public void setDateOfCreationAsString(String dateOfCreationAsString) {
	this.dateOfCreationAsString = dateOfCreationAsString;
  }

  public void setLastUpdatedAsString(String lastUpdatedAsString) {
	this.lastUpdatedAsString = lastUpdatedAsString;
  }

  public String getDateOfCreationAsString() {
	return dateOfCreationAsString;
  }

  public String getLastUpdatedAsString() {
	return lastUpdatedAsString;
  }

  @Override
  public int hashCode() {
	return new HashCodeBuilder().append(id).toHashCode();
  }

  @Override
  public boolean equals(Object obj) {
	Item other = (Item) obj;
	return new EqualsBuilder().append(id, other.id).isEquals();
  }

  @Override
  public String toString() {
	return "Item [id=" + id + ", name=" + name + ", unit=" + unit + ", itemType=" + itemType + ", perUnitCost="
		+ perUnitCost + ", description=" + description + ", dateOfCreation=" + dateOfCreation + ", createdBy="
		+ createdBy + ", lastUpdated=" + lastUpdated + ", lastUpdatedBy=" + lastUpdatedBy + ", dateOfCreationAsString="
		+ dateOfCreationAsString + ", lastUpdatedAsString=" + lastUpdatedAsString + "]";
  }

}
