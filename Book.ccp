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
