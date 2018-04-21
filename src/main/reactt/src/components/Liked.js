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

                <li key={track.id} className="list-group-item">
                    {track.title}
                    <button type="button" className="btn btn-secondary track__play__button">Play</button>
                    </li>
        )

        return (
            <div className="thumbnail album__container" >
                <ul className="list-group list-group-flush">
                    {tracks}
                </ul>
            </div>


        )


    }
}

{/*<li key={track.id} className="list-group-item">{track.title}*/}
    {/*<button type="button" className="btn btn-secondary track__play__button">Play</button>*/}
{/*</li>*/}