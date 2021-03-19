import React from 'react';  //react is a core library for developing UI application


import { View, StyleSheet } from 'react-native';  //is a react based library for developing mobile UI
import AppHeader from './src/components/app-header';
import BookDetailsScreen from './src/screens/book-details-screen';
import BookAddScreen from './src/screens/book-add-screen';
import BookListScreen from './src/screens/book-list-screen';

import globalStyle from './src/styles/global';

const App = () => (

    <View style={styles.container}>
        <AppHeader heading='All About Books' displayDate={true} />
        <BookListScreen/>

        {/* <BookDetailsScreen
            title='The Accursed God'
            author='Vivek Dutta Mishra'
            price={336}
            rating={4.2}
            votes={80}
        /> */}
    </View>

);

const styles=StyleSheet.create({
    ...globalStyle,
    //style specific to this container
    app:{

    }
})



export default App;






