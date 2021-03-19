import React,{useState} from 'react';
import { View, Text, FlatList,Modal, Button, TouchableOpacity, Image, StyleSheet } from 'react-native';
import globalStyle from '../styles/global';
import books from '../data/books';
import Colors from '../styles/colors';
import toast from '../components/toast';
import BookDetails from '../components/book-details';



let BookListItem = ({ book,onSelection }) => {
    console.log(book.cover);
    return (
        <TouchableOpacity
                onPress={onSelection}
                style={styles.listItemContainer}>
            <View style={styles.listItem}>
                <Image style={styles.listItemImage} source={{ uri: book.cover }} />
                <Text style={styles.bookTitle}>{book.title}</Text>
                <View style={styles.infoLine}>
                    <Text>Rs {book.price}</Text>
                    <Text> {book.rating}/5</Text>
                </View>
            </View>
        </TouchableOpacity>
    );
}

const BookListScreen = ({ navigation, children }) => {

    const [selectedBook, selectBook]=useState(null);

    const onSelect=(book)=>{
        //toast(book.title);
        //setState({selectedBook:book});
        selectBook(book);
    }
    //Todo Init
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Book List Screen</Text>
            <FlatList
                numColumns={2}
                style={styles.listStyle}
                data={books}
                keyExtractor={book => book.isbn}

                renderItem={({ item }) => (
                    <BookListItem onSelection={()=>onSelect(item)} book={item} />
                )
                }

            />
            <Modal visible={selectedBook!==null}  animationType="slide">
                <View style={styles.modalStyle}>
                    
                    <BookDetails book={selectedBook} />
                    <View><Button 
                                title="Close"
                                onPress={()=>selectBook(null)}    
                            />
                    </View>
                    
                </View>
            </Modal>
        </View>
    );
};


const styles = StyleSheet.create({
    ...globalStyle,  //take all values from global and merge it here
    listStyle: {
        
        width: "100%",
        borderWidth: 2,
        borderColor: 'red',
        paddingTop: 10
    },
    listItemContainer: {
        width: "50%",
        height: 300,
        marginVertical:20
    },
    listItem: {
        margin: 10,
        paddingVertical: 20,
        paddingHorizontal: 10,
        //borderBottomWidth:1,
        alignItems: 'center',
        justifyContent: 'center',
        borderBottomColor: 'black',
        backgroundColor: '#CCC',
        borderRadius:10,
        ...globalStyle.boxShadow
    },
    bookTitle: {

        fontSize: 18,
        textAlign: 'center',
        fontWeight: 'bold'
    },
    listItemImage: {
        minHeight:220,
        maxHeight:220,
        height: 220,
        width: 150
    },
    listInfo: {
        flex: 1,

        paddingHorizontal: 10

    },
    infoLine: {
        flexDirection: 'row',
        width: "100%",

        justifyContent: 'space-between'
    },
    infoText: {
        // textAlign:'right',
        marginVertical: 5,
        fontSize: 15

    },
    tagContainer: {
        margin: 5,
        backgroundColor: '#000',
        padding: 5,
        borderRadius: 15
    },
    tag: {
        fontSize: 12,
        color: 'white'


    },
    modalStyle:{
      flex:1,
      alignItems: 'center',
      justifyContent: 'center'   
    }

});
export default BookListScreen;