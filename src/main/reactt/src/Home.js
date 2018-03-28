import React from 'react';
import AlbumList from './AlbumList'
import AlbumItem from './AlbumItem'
import {Link, Route, Switch} from 'react-router-dom'





class Home extends React.Component {
    constructor(anyparams){
        super(anyparams)

        this.state = {
            albums: []
        }

        this.getAlbums();

    }
    getAlbums (){
        var self = this;
        var request = new window.XMLHttpRequest();
        request.open('GET', 'http://localhost:8080/api/albums/get-all', true);
        request.onload = function() {
            self.setState({albums:JSON.parse(request.responseText)});

        }
        request.send();
    }
    getAlbumById = id => this.state.albums.find(album => album.id === id)


    render() {
        const {match, history, location} = this.props;
        console.log(this.getAlbumById(2))
        return (
            <div>
                <nav>
                    <Link to="/home/1">Third</Link>
                </nav>
                <Switch>
                    <Route exact path={match.path} render={props => <AlbumList albums={this.state.albums} />} />
                    <Route path={`${match.path}/:id/`} render={props => <AlbumItem  album={this.getAlbumById(props.match.params.id)} />} />
                </Switch>
            </div>
        );
    }
}

const AlbumWrapper = props => {
    return <AlbumItem album={props.getAlbumById(props.match.params.id)} />
}

export default Home;
