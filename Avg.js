

function avg(a,b,c,d,e){
    let list=[a,b,c,d,e];  
console.log('list',list); 

console.log('list.length',list.length);
    console.log((plus(a,b,c,d,e))/list.length);
}

avg(1,2,3,4,5);
avg(1,2,3,4);

function plus(a,b,c,d,e){
    return(a+b+c+d+e);
}