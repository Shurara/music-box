import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import { createStore, combineReducers } from 'redux';

//redux reducer
function counter(state = {value: 5}, action) {
    switch (action.type) {
        case 'INCREMENT': return { ...state, value: state.value += 1 };
        case 'DECREMENT': return { ...state, value: state.value -= 1 };
        default: return state;
    }
}

//redux store creation
let store = createStore(combineReducers({counter}));
store.subscribe(() => {console.log("Store updated:"); console.log( store.getState() );});

ReactDOM.render(<Provider store={store}><App /></Provider>, document.getElementById('root'));
registerServiceWorker();