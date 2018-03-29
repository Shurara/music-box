import React from 'react';



class AlbumItem extends React.Component {
    constructor(anyparams){
        super(anyparams)

        this.state = {
            album: {},
            id: this.props.id,
            tracks: []
        }
        this.getAlbum()
    }
    getAlbum() {
        var self = this;
        var request = new window.XMLHttpRequest();
        request.open('GET', 'http://localhost:8080/api/albums/'+ self.state.id, true);
        request.onload = function() {
            self.setState({ album:JSON.parse(request.responseText)});
            self.setState({ tracks:self.state.album.tracks.map(track => <li>{track.title}</li>)})

        }
        request.send();
    }
    render() {


        return (
            <div className="album">
                <header>{this.state.album.title}</header>
                <img className="album__cover" src={this.state.album.cover}/>
                <ul>
                    {this.state.tracks}
                </ul>
            </div>
        )
    }
}

export default AlbumItem;