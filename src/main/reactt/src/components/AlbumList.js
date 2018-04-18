import React from 'react'
import {Link} from 'react-router-dom';
export default class AlbumList extends React.Component {

    constructor(params){
        super(params)

        this.state = {
            albums: []
        }
    }
    componentDidMount(){
        if (this.state.albums.length === 0) {
            fetch('/api/albums/get-all')
                .then(res => res.json())
                .then(data => this.setState({albums: data}))
        }
    }


    render() {
        const albums = this.state.albums.map(album =>
            <div key={album.album_id}className="album_box">
                <Link to={"/albums/" + album.id}>
                <p>{album.title}</p>
                <img className="album_cover" src={album.cover}/>
                </Link>
            </div>)
        return (

            <div>
                <p>albums from db</p>
                {albums}
            </div>
        )
    }
}