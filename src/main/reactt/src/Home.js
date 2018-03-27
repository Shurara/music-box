import React from 'react';

export default class Home extends React.Component {
    constructor(anyparams){
        super(anyparams)

        this.state = {
            albums: []
        }

        this.getAlbums();

    }
    getAlbums (){
        var self = this;
        var request = new window.XMLHttpRequest();
        request.open('GET', 'http://localhost:8080/api/albums/get-all', true);
        request.onload = function() {
            self.setState({ albums:JSON.parse(request.responseText)});

        }
        request.send();
    }
    render() {
        return (
            <div>
                <p>Home stuff here with photos</p>
            </div>
        );
    }
}