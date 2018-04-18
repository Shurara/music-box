// import React from 'react';
// import AlbumList from './AlbumList'
// import AlbumItem from './AlbumItem'
// import {Link, Route, Switch} from 'react-router-dom'
//
//
//
//
//
// class Home extends React.Component {
//
//     render() {
//         const {match} = this.props;
//         const albumId= this.props.match.params.id;
//
//         return (
//             <div>
//                 <Switch>
//                     <Route exact path={match.path} component={AlbumList}/>
//                     <Route exact path={`${match.path}/:albumId/`} component={AlbumItem}/>
//                 </Switch>
//             </div>
//         );
//         // return (
//         //     <div>
//         //         <Switch>
//         //             <Route exact path={match.path} component={AlbumList}/>
//         //             <Route exact path={`${match.path}/:albumId/`} component={AlbumItem}/>
//         //         </Switch>
//         //     </div>
//         // );
//     }
// }
//
// export default Home;
