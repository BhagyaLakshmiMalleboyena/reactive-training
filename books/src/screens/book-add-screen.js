import React from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';
import globalStyle from '../styles/global';
import Colors from '../styles/colors';
import LabeledInput from '../components/labeled-input';

console.log('LabeledInput', LabeledInput);


class BookAddScreen extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            title: '',
            author: '',
            price: 0,
            isbn: '',
            coverUrl: ''
        };

    }

    render = () => {

        console.log(this.state);

        return (
            <View style={styles.container}>
                <Text style={styles.title}>Add New Book</Text>

                <LabeledInput label='ISBN Number'
                    value={this.state.isbn}
                    onChange={value => this.setState({ isbn: value })} />

                <LabeledInput label='Book Title'
                    value={this.state.title}
                    onChange={value => this.setState({ title: value })}
                />

                <LabeledInput label='Author Name'
                    value={this.state.author}
                    onChange={author => this.setState({ author: author })} />

                <LabeledInput label='Price'
                    value={this.state.price}
                    onChange={price => this.setState({ price: parseFloat(price) })} />

                <LabeledInput label='Cover Url'
                    value={this.state.coverUrl}
                    onChange={value => this.setState({ coverUrl:value })} />

                <Button title='Save' />
            </View>
        );
    };

}

const styles = StyleSheet.create({
    ...globalStyle,  //take all values from global and merge it here
   buttonStyle:{

   }

});
export default BookAddScreen;