Step 1... Our Library System will allow users to...

        * addBooks
        * listAllBooks
        * borrowBooks

Step 2... Identifying Input and Output

        * Input... book details (title, author), user's choice
        * Output... Information about added books, the list of all books and status messages

Step 3... Function signature

Step 4... Breaking down the task

        * 'addBooks' -> add a book to the Library
        * 'listBooks' -> display a list of all the books in the Library
        * 'borrowBook' -> mark a book as borrowed

Step 5... Pseudocode

        1. addBook...
        * create a new Book object with the given title and author
        * add the book to the list of books
        * display a success message

        2. listBooks...
        * loop through the list of books
        * display each book's title and author

        3. borrowBook...
        * find the book with the given title in the list
        * if the book is available, mark it as borrowed
        * display a success message. if the book is not found or already borrowed,
            show an error message

Step 6... Implementing the functions

Step 7... Testing and Debugging

        * creating a main method to interact with the Library

Step 8... Optimizing and Refactoring

        * code improvements