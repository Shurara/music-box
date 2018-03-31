import React from 'react'
import { Route, Link, Switch } from 'react-router-dom'
import Navigation from "./components/Navigation"
import SoundPlayer from "./components/SoundPlayer"
import AlbumList from "./components/AlbumList";
import FavoriteAlbums from "./containers/FavoriteTracksBox";
import Login from "./containers/LoginBox";
import TrackList from "./components/TrackList"



class App extends React.Component {
    render() {

      return (
          <div>
              <Navigation />
              <SoundPlayer/>
              <Switch>
                  <Route exact path = "/" component ={AlbumList}/>
                  <Route exact path = "/albums/:id" component ={TrackList}/>
                  <Route exact path = "/favorites" component ={FavoriteAlbums}/>
                  <Route exact path = "/albums" component ={AlbumList}/>
                  <Route exact path = "/login" component ={Login}/>
              </Switch>
          </div>

      )
    }
}

export default App





// <Link to="/albums">Albums</Link>
// <Link to="/albums/:id">Albums Tracks</Link>
// <Link to="/favorites">Favorite Tracks</Link>
// <Link to="/adminbox">Admin Box</Link>
// <Link to="/login">Login</Link>






// import React from 'react'
// import { Route, Link, Switch } from 'react-router-dom'
// import  Root from './Root'
// import  Articles from './Articles'
// import Contacts from './Contacts'
//
//
//
// class App extends React.Component {
//     render() {
//
//         return (
//             <div>
//                 <div>
//                     <p>navigation</p>
//                     <Link to="/">Root</Link>
//                     <Link to="/articles">Articles</Link>
//                     <Link to="/contacts">Contacts</Link>
//                 </div>
//                 <Switch>
//                     <Route exact path = "/" component ={Root}/>
//                     <Route exact path = "/articles" component ={Articles}/>
//                     <Route exact path = "/contacts" component ={Contacts}/>
//                 </Switch>
//             </div>
//         )
//     }
// }
//
// export default App


