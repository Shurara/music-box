import React from 'react';
import PropTypes from 'prop-types'

class AlbumList extends React.Component {

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
    redirectToTarget = id => {
        window.location.href = "/home/" + id;
    }

    render() {
        const albums = this.state.albums.map(album =>
            <div className="album">
            <header>{album.title}</header>
            <img onClick={() => this.redirectToTarget(album.id)} className="album__cover" src={album.cover}/>
        </div>)
        return (
            <div className="home">
                {albums}
            </div>
        )
    }
}

export default AlbumList;