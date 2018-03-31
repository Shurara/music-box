import React from 'react'
import { Route, Link, Switch } from 'react-router-dom'


class Navigation extends React.Component {
    render() {

        return (
            <div>
                <nav>
                    <Link to="/albums">Albums</Link>
                    <Link to="/albums/:id">Albums Tracks</Link>
                    <Link to="/favorites">Favorite Tracks</Link>
                    <Link to="/adminbox">Admin Box</Link>
                    <Link to="/login">Login</Link>
                </nav>

            </div>

        )
    }
}

export default Navigation