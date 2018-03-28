import React from 'react';



const AlbumItem = props => {
    const album = props.album;

    return (
        <div className="album">
            <header>{album.title}</header>
            <img className="album__cover" src={album.cover}/>
        </div>
    )
}

export default AlbumItem;