function book(isbn,title,author,price,rating){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.price=price;
        this.rating=rating;
}

let manager=[]; 
manager.push(addbook('isbn1', 'title1','author1','price1','rating1'));
manager.push(addbook('isbn2', 'title2','author2','price2','rating2'));
manager.push(addbook('isbn3', 'title3','author3','price3','rating3'));
manager.push(addbook('isbn4', 'title4','author4','price4','rating4'));


console.log('manager:',manager)

function addbook(isbn,title,author,price,rating){
    return new book(isbn,title,author,price,rating);
}
