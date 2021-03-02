function book(isbn,title,author,price,rating){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.price=price;
        this.rating=rating;
}

let manager=[]; 
manager.push(addbook('1', 'title1','author1','price1','rating1'));
manager.push(addbook('1', 'title2','author2','price2','rating2'));
manager.push(addbook('2', 'title3','author3','price3','rating3'));
manager.push(addbook('2', 'title4','author4','price4','rating4'));

function addbook(isbn,title,author,price,rating){
    return new book(isbn,title,author,price,rating);
}
console.log('manager:',manager);

function filterByIsbn(isbnNum){
    let isbnlist=[];
        for(let manage in manager){
             if(manager.isbn===isbnNum){
                 isbnlist.push(manager);
                 return isbnlist;
                }
                
    }
    console.log(isbnlist);
}

filterByIsbn(1);
