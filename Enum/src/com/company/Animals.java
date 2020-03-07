package com.company;

public  enum Animals {

  CAT("fergusCat"),DOG("fergusDog"),MOUSE("fergusMouse");
    private String name;
    Animals(String name)
    {
      this.name= name;
    }

  public String getName() {
    return name;
  }
  public String toString(){
      return "Cagrıldı" + name;
  }
}
