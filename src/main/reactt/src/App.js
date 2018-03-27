import React from 'react';


class Api extends React.Component{

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

    render(){
        var self = this;
        console.log(this.state.albums)


        return (
            <div>
                rabotaet
            </div>
        )
    }
}


export default Api;
