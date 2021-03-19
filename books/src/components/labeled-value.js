import React from 'react';
import {Text,View,StyleSheet} from 'react-native';
import  Colors  from '../styles/colors';
import globalStyle from '../styles/global';




const LabeledValue=({label,value})=>(
    <View style={styles.row}>
        <Text style={styles.label}>{label}</Text>
        <Text style={styles.valueText}>{value}</Text>
    </View>
);

const styles=StyleSheet.create({
    ...globalStyle,  //take all values from global and merge it here

    label: {

        fontSize: 20,
        color: Colors.bodyTextColor,
        marginRight: 20
    },
    valueText: {
        fontSize: 22,
        color: Colors.bodyTextColor,
        fontWeight: 'bold'
    }
})


export default LabeledValue;