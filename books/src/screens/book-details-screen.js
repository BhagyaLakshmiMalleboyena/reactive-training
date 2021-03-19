import React from 'react';
import {StyleSheet,ScrollView,Text,Image,View,Modal,Button} from 'react-native';

import LabeledValue from '../components/labeled-value';
import globalStyle from '../styles/global';
import Colors from '../styles/colors';
import toast from '../components/toast';


const BookDetailsScreen=({title,author,price,rating,votes})=>{

    
    let onButtonClick=()=>{
      console.log('Added To Favorite');
      toast('Added to Favorite');
    }

    return (
      <ScrollView style={styles.container}>
          <View style={styles.buttonStyle}>
            <Button color={Colors.primaryColor} 
                   title='Add to Favorite' 
                   onPress={onButtonClick}
                   />
          </View>
          <Text style={styles.title}>{title}</Text>
         
         <LabeledValue label='Author' value={author} />
         <LabeledValue label='Price' value={`Rs ${price}`} />
         <LabeledValue label='rating' value={`${rating} out of 5 (${votes} votes)`} />
         
          <Image style={styles.coverImage} 
                 source={require('../../assets/the-accursed-god-small.jpg')}
                 resizeMode='cover'
          />

          
      </ScrollView>
    );
 };


 const styles=StyleSheet.create({
    ...globalStyle,  //take all values from global and merge it here
    //here you should styles for current screen
    screen:{

    },
    buttonStyle:{
      
      margin:5,
      alignSelf:'flex-end'
      
    },
    coverImage:{
      ...globalStyle.boxShadow,
      padding:5,
      borderWidth:5,
      borderColor:Colors.accentColor,
      height:600,
      width:'100%',
      alignSelf:'center'
    }
 })

 export default BookDetailsScreen;
 