import React from 'react';
import AlbumItem from'./AlbumItem'

class AlbumList extends React.Component {




    render() {
        return (
            <div className="home">
                {this.props.albums.map(album => <AlbumItem key={album.id} album={album} />)}
            </div>
        )
    }
}

export default AlbumList;