
import React from 'react';
import {Text,TextInput,View} from 'react-native';
import globalStyle from '../styles/global';
import Colors  from '../styles/colors';

class LabeledInput extends React.Component {

    constructor(props){
        super(props);

        this.state={
            value: props.value? props.value:''
        };

    }

    render(){
        return (
                <View style={styles.labeledInputContainer}>
                    <Text style={styles.label}>{this.props.label}</Text>
                    <TextInput 
                                autoCapitalize="none"
                                autoCorrect={false}

                                value={this.state.value}
                                style={styles.textInput} 
                                placeholder={this.props.placeholder||this.props.label}
                                onChangeText={value=>this.setState({value})}
                                onEndEditing={()=>this.props.onChange(this.state.value)}
                                />
                </View>
        )
    }


};

const styles={
    ...globalStyle,
    label:{
        paddingRight:10,
        fontSize:18
   },
   textInput:{
       flex:1,
       fontSize:20,
       padding:5,
       borderColor:'gray',
       borderBottomWidth:2
   },
   labeledInputContainer:{
       ...globalStyle.row,
       margin:10,
       alignItems:'flex-end',
       //justifyContent: 'center',
   }
}

export default LabeledInput;
