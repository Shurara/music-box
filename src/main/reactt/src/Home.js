import React from 'react';
import AlbumList from './AlbumList'
import AlbumItem from './AlbumItem'
import {Link, Route, Switch} from 'react-router-dom'





class Home extends React.Component {

    render() {
        const {match, history, location} = this.props;

        return (
            <div>
                <nav>
                </nav>
                <Switch>
                    <Route exact path={match.path} render={props => <AlbumList />}/>
                    <Route path={`${match.path}/:id/`}
                           render={props => <AlbumItem id={props.match.params.id}/>}/>
                </Switch>
            </div>
        );
    }
}

export default Home;

