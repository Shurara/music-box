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
    getAlbum = () => fetch('/api/albums/' + this.props.match.params.id,)
        .then(res=>res.json())
        .then((data) => this.setState({album: data}))
        .then(() => this.setState({tracks:this.state.album.tracks.map(track =>
            // key={track.id}
            <li class="list-group-item">{track.title}
                <button type="button" class="btn btn-secondary track__play__button">Play</button>
            </li>
        )}))


    render() {

        return (
            <div className="thumbnail album__container">
                <h4 className="text-center"> {this.state.album.title}</h4>
                <img  src={this.state.album.cover} className="img-responsive cover__album__tracks"/>
                <ul class="list-group list-group-flush">
                    {this.state.tracks}
                </ul>

            </div>



        )
    }

}


export default AlbumItem;