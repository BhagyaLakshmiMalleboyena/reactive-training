import React from 'react';
import {Text} from 'react-native';

import {search,each} from './utils';
import TextBook from './book';


each([1,2,4,5,6], console.log);

console.log('TextBook',TextBook);




export default () => <Text>Hello World</Text>;