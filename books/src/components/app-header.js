import React from 'react';
import {View,Text,StyleSheet} from 'react-native'

import globalStyle from '../styles/global';
import Colors from '../styles/colors';
function AppHeader(props){

    return (
      <View style={styles.headerContainer}>
           <Text style={styles.headerStyle}>{props.heading}</Text>
           <Text style={styles.dateStyle}>{props.displayDate ? new Date().toDateString().toUpperCase() : ''}</Text>
      </View>
    );
}


const styles=StyleSheet.create({
    ...globalStyle,  //take all values from global and merge it here
    headerContainer: {

        paddingTop: 40,
        backgroundColor: Colors.primaryColor,
        paddingVertical: 10,
        paddingLeft: 5,
        ...globalStyle.boxShadow,
        marginBottom:5
    },
   

    headerStyle: {
        color: Colors.headerTitleColor,
        fontSize: 30,
        marginTop: 20
       // fontFamily: 'script'


    },

    dateStyle: {
        textAlign: 'right',
        fontSize: 12,
        fontWeight: 'bold',
        //fontFamily: 'courier',
        color: Colors.accentColor
    }
})


export default AppHeader;