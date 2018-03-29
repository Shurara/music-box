import React from 'react';
import {Route, Link, Switch} from 'react-router-dom';
import Home from './Home';




class App extends React.Component {
    render() {

        return (
            <div>
                <header>
                    <Link to="/home">Home </Link>

                </header>
                <Switch>
                    <Route path="/home" component={Home}/>
                </Switch>
            </div>
        );
    }
}



export default App;


