import { StyleSheet } from 'react-native';
import Colors from './colors';

const styles = StyleSheet.create({

    container: {

        backgroundColor: Colors.bodyColor,
        height: "100%"

    },
  
    title: {
        marginTop: 10,
        color: Colors.screenTitleColor,
        fontSize: 30,
        //fontFamily: 'script',
        textAlign: 'center',
        fontWeight: 'bold'
    },
   
    row: {

        marginVertical: 10,
        marginHorizontal: 15,
        flexDirection: 'row'
    },
    boxShadow:{
        //for android. will be ignored by IOS
        elevation:30,
        //shadow is for IOS. will be ignored by android
        shadowColor:'black',
        shadowOffset:{width:0, height:5},
        shadowRadius:15,
        shadowOpacity: 0.9,
        
    }

});


export default styles;