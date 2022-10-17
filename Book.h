#include <iostream>
#include "Book.h"

int main() {
  Book discoTitanic("Disco Titanic");
  discoTitanic.createNewParagraph("Paragraph 1");
  discoTitanic.createNewParagraph("Paragraph 2");
  discoTitanic.createNewParagraph("Paragraph 3");
  discoTitanic.createNewImage("Image 1");
  discoTitanic.createNewParagraph("Paragraph 4");
  discoTitanic.createNewTable("Table 1");
  discoTitanic.createNewParagraph("Paragraph 5");
  std::cout << discoTitanic << "\n";
  return 0;
}


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

#include "Book.h"

Book::Book() {}

Book::Book(std::string titluCarte) : titluCarte(titluCarte) {}

Book::~Book() {}

void Book::createNewParagraph(std::string numeleParagrafului) {
  continutCarte.push_back(numeleParagrafului);
}

void Book::createNewImage(std::string numeleImaginii) {
  continutCarte.push_back(numeleImaginii);
}

void Book::createNewTable(std::string numeleTabelei) {
  continutCarte.push_back(numeleTabelei);
}

std::ostream& operator<<(std::ostream& COUT, const Book& myBook) {
  COUT << myBook.titluCarte + "\n";
  for (const std::string& continutCurent : myBook.continutCarte) {
     COUT << (continutCurent.find("Paragraph") != std::string::npos ? "\t" : "\t\t") + continutCurent + "\n";
  }
  return COUT;
}



