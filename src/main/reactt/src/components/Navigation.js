import React from 'react'
import { Link } from 'react-router-dom'


class Navigation extends React.Component {
    render() {

        return (
            <div className="navigation">
                <nav>
                    <Link to="/albums">Albums</Link>
                    <Link to="/favorites">Favorite Tracks</Link>

                    <Link to="/adminbox">Admin Box</Link>
                    <Link to="/login">Login</Link>
                    {/*<Link to="/tracklist">Tracklist</Link>*/}
                </nav>

            </div>

        //     <Route exact path = "/" component ={AlbumList}/>
        // <Route exact path = "/albums/:id" component ={TrackList}/>
        // <Route exact path = "/favorites" component ={FavoriteTrackBox}/>
        // <Route exact path = "/albums" component ={AlbumList}/>
        // <Route exact path = "/login" component ={LoginBox}/>
        // <Route exact path = "/tracklist" component ={TrackList}/>
        // <Route exact path="/adminbox" component ={AdminBox}/>

        )
    }
}

export default Navigation