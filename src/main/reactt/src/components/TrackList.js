import React from 'react'
export default class Profiles extends React.Component {
    constructor(params){
        super(params)

        this.state = {
            albums: []
        }
    }
    componentDidMount(){
        if (this.state.albums.length === 0) {
            fetch('api/albums/get-all')
                .then(res => res.json())
                .then(data => this.setState({albums: data}))
        }
    }

    // render() {
    //     return (<div>
    //         <h2>There will be tracklist</h2>
    //         {this.state.albums.map(album => <li>{album.id}</li>)}
    //     </div>)
    // }

render() {
    const albums = this.state.albums.map(album =>
        <div key={album.id}className="album">
            <header>{album.title}</header>
            <img className="album__cover" src={album.cover}/>
        </div>)
    return (

        <div>
            <p>albums from db</p>
            {albums}
        </div>
    )
}
}