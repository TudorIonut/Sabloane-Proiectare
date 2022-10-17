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
