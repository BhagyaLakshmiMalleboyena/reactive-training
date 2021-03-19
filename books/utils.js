

export function search(list, matcher){
    let result=[];
    for(let value of list)
        if(matcher(value))
            result.push(value);

    return result;
}

export function each(list, action){
    for(let value of list)
        action(value);
}