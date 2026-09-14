package com.stopnrest.model;
import jakarta.persistence.*;
@Entity
public class Room {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String number; private String type; private double price; private boolean available=true;
  public Long getId(){return id;} public String getNumber(){return number;} public void setNumber(String v){number=v;}
  public String getType(){return type;} public void setType(String v){type=v;} public double getPrice(){return price;}
  public void setPrice(double v){price=v;} public boolean isAvailable(){return available;} public void setAvailable(boolean v){available=v;}
}