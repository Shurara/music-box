import React from 'react'
import { Route, Switch } from 'react-router-dom'
import Navigation from "./components/Navigation"
import SoundPlayer from "./components/SoundPlayer"
import AlbumList from "./components/AlbumList";
import FavoriteTrackBox from "./containers/FavoriteTracksBox";
import LoginBox from "./containers/LoginBox";
import TrackList from "./components/TrackList"
import AdminBox from "./containers/AdminBox"
import AlbumItem from "./components/AlbumItem"



class App extends React.Component {
    render() {

      return (
          <div>
              <Navigation />
              <Switch>
                  <Route exact path = "/" component ={AlbumList}/>
                  {/*<Route exact path = "/home" component ={Home}/>*/}
                  <Route exact path = "/albums" component ={AlbumList}/>
                  <Route exact path="/albums/:id" component={AlbumItem} />
                  {/*<Route exact path = "{`/albums/:id`}" component ={AlbumItem}/>*/}
                  <Route exact path = "/favorites" component ={FavoriteTrackBox}/>
                  <Route exact path = "/login" component ={LoginBox}/>
                  <Route exact path = "/tracklist" component ={TrackList}/>
                  <Route exact path="/adminbox" component ={AdminBox}/>
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


