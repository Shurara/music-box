import React from 'react'
import { Link } from 'react-router-dom'


class Navigation extends React.Component {
    render() {

        return (
            <nav className="navbar navbar-default" role="navigation">
                <div className="container">
                    <div className="navbar-header">
                        <button type="button" className="navbar-toggle" data-toggle="collapse" data-target="#navbar-brand-centered">
                            <span className="sr-only">Toggle navigation</span>
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>
                        </button>
                        <div className="navbar-brand navbar-brand-centered">MUSICBOX</div>
                    </div>

                    <div className="collapse navbar-collapse" id="navbar-brand-centered">
                        <ul className="nav navbar-nav">
                            <li><Link to="/albums">Albums</Link></li>
                            <li><Link to="/favorites">Favorite Tracks</Link></li>

                        </ul>
                        <ul className="nav navbar-nav navbar-right">
                            <li><Link to="/adminbox">Admin Box</Link></li>
                            <li><Link to="/login">Login</Link></li>

                        </ul>
                    </div>
                </div>
            </nav>
            // <div className="navigation">
            //     <nav>
            //         <Link to="/albums">Albums</Link>
            //         <Link to="/favorites">Favorite Tracks</Link>
            //
            //         <Link to="/adminbox">Admin Box</Link>
            //         <Link to="/login">Login</Link>
            //         {/*<Link to="/tracklist">Tracklist</Link>*/}
            //     </nav>
            //
            // </div>

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