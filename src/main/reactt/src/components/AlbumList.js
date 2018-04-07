import React from 'react'
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
            <div key={album.album_id}className="album">
                <header>{album.title}</header>
                <img className="album_cover" src={album.cover}/>
            </div>)
        return (

            <div>
                <p>albums from db</p>
                {albums}
            </div>
        )
    }
}