import React from 'react'

export default class Liked extends React.Component {
    constructor(params) {
        super(params)

        this.state = {
            likedTracks: []
        }
    }

    componentDidMount() {
        if (this.state.likedTracks.length === 0) {
            fetch('/api/tracks/liked')
                .then(res => res.json())
                .then(data => this.setState({likedTracks: data}))
        }
    }


    render() {
        const tracks = this.state.likedTracks.map(track =>
            <div key={track.id}>

                <div className="track-title">
                    <p>{track.title}</p>
                </div>
            </div>)
        return (

            <div className="track-liked">
                {tracks}
            </div>
        )


    }
}