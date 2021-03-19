
import {Platform,ToastAndroid,Alert} from 'react-native';


const toast = (message, duration=ToastAndroid.LONG)=>{

    if(Platform.OS==="android")
         ToastAndroid.show(message,duration);
    else
        Alert.alert(message);
};

export default toast;