import React from 'react';
import {View,Text,ScrollView,Button,Image,StyleSheet} from 'react-native';
import globalStyle from '../styles/global';
import books from '../data/books';
import Colors from '../styles/colors';

let BookListItem=({book})=>{
    console.log(book.cover);
    return (
        <View style={styles.listItem}>
            <Image style={styles.listItemImage} source={{uri:book.cover}} />
            <View style={styles.listInfo}>
                <Text numberOfLine={2} ellipsizeMode='tail' style={styles.bookTitle} >{book.title}</Text>
                <Text style={styles.infoText}>by {book.author}</Text>
                <Text style={styles.infoText}>{book.rating}/5</Text>
                <Text style={styles.infoText}>₹ {book.price}</Text>
                <Text>Tags:</Text>
                <View style={styles.row}>
                   { book.tags.map(tag =>(
                       <View style={styles.tagContainer}>
                        <Text key={tag} style={styles.tag}>{tag}</Text>
                        </View>
                        ))
                    }
            </View>  
                
            </View>
            
        </View>
    );
}

const BookListScreen= ({navigation,children})=> {
    //Todo Init
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Book List Screen</Text>
            <ScrollView style={styles.listStyle}>
                {books.map(book=> <BookListItem key={book.isbn} book={book} />)}
            </ScrollView>
        </View>
    );
};


const styles= StyleSheet.create({
   ...globalStyle,  //take all values from global and merge it here
   listStyle:{
       
       flex:1,
       borderWidth:2,
       borderColor:'red',
       paddingTop:10
   },
   listItem:{
    flexDirection:'row',
    paddingVertical:10,
    borderBottomWidth:1,
    borderBottomColor:'black'
   },
   bookTitle:{
    
    fontSize:22,
    textAlign: 'right',
    fontWeight: 'bold'
   },
   listItemImage:{
       height: 170,
       width:110
   },
   listInfo:{
       flex:1,
       
       paddingHorizontal:10
       
   },
   infoText:{
       textAlign:'right',
       marginVertical:5,
       fontSize:18

   },
   tagContainer:{
    margin:5,
    backgroundColor:'#000',
    padding:5,
    borderRadius:15
   },
   tag:{
       fontSize:12,
       color: 'white'
       
       
   }

});
export default BookListScreen;