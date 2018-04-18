import React from 'react';



class AlbumItem extends React.Component {
    constructor(anyparams){
        super(anyparams)

        this.state = {
            album: {},
            tracks: []
        }
        this.getAlbum()
    }
    getAlbum = () => fetch('/api/albums/' +this.props.match.params.id,)
        .then(res=>res.json())
        .then((data) => this.setState({album: data}))
        .then(() => this.setState({tracks:this.state.album.tracks.map(track =>
                <div className='tracks' key={track.id}>
                    <p className='track'>{track.title}</p>

                </div>)}))


    render() {

        return (
            <div className="album">
                <h2>
                    {this.state.album.title}
                </h2>
                <img className="album__cover" src={this.state.album.cover}/>

                <div>
                    {this.state.tracks}
                </div>
            </div>
        )
    }

}


export default AlbumItem;