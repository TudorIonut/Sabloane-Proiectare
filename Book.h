#pragma once
#include <string>
#include <vector>
#include <iostream>

class Book {
  std::string titluCarte;
  std::vector<std::string> continutCarte;

 public:
  Book();
  Book(std::string titluCarte);
  ~Book();
  void createNewParagraph(std::string numeleParagrafului);
  void createNewImage(std::string numeleImaginii);
  void createNewTable(std::string numeleTabelei);
  friend std::ostream& operator<<(std::ostream& COUT, const Book& myBook);
};
