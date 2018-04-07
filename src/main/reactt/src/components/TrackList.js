import React from 'react'
export default class TrackList extends React.Component {

    constructor(params){
        super(params)

        this.state = {
            tracks: []
        }
    }
    componentDidMount(){
        if (this.state.tracks.length === 0) {
            fetch('/api/tracks/get-all')
                .then(res => res.json())
                .then(data => this.setState({albums: data}))
        }
    }


    render() {
        const tracks = this.state.tracks.map(track =>
            <div key={track.track_id}className="album">
                <header>{track.title}</header>
                <link>{track.url}</link>
            </div>)
        return (

            <div>
                <p>tracks from db</p>
                {tracks}
            </div>
        )
    }
}