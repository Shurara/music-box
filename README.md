# music-box
This is the description of third step project called "MusicBox".
The application that you asked to implement is a web-service for listening music.
On this project, you will be asked to work in pairs.
Functional Requirements
A user should be able to explore albums available on the site.
A user should be able to see the tranks on the album.
A user should be able to play/stop/pause a track. In case user open another page, the song should continue playing.
The admin should be able to create/retrieve/update/delete albums and tracks.
Technical recuirements
The backend should be implemented in Java with Spring MVC/Boot, Hibernate frameworks.
Mysql should be used as a database solution.
Communication between backend and frontend should be implemented according to REST principles.
The frontend should be implemented in JavaScript with React, Redux, Bootstrap libraries.
Album covers and audio files should be stored to file system.


Tasks
In a team, we have 2 members. Let's say member L and member R.
Here is a task for member L:
Make SQL script that creates ALBUMS table.
Create seed project that includes Spring MVC/Boot, Hibernate. The project should start successfully and return all albums from the database on /api/albums.
Implement following REST API: (current user_id is hardcoded)
3.1 GET /api/albums/{id}
3.2 PUT /api/albums/{id}
3.3 DELETE /api/albums/{id}
3.4 DELETE /api/albums/{id}/cover
With React, Redux, Bootstrap design main page with albums.
Make SQL script that creates USERS table.
Implement login/logout endpoints
6.1 POST /api/login
6.2 POST /api/logout
Implement GET /api/users/me
Utilizing Spring Security allow only admin get accuss to
PUT /api/albums/{id}
DELETE /api/albums/{id}
POST /api/tracks
PUT /api/tracks/{id}
DELETE /api/tracks/{id}
Investigate Audio API in javascript and implement play/pause/stop buttons on a track.
Implement login/logout page.
Tasks for member R:
Utilizing React, Redux, WebPack please create Admin Page for CRUD operations with Albums, Tracks, with an ability to upload covers, mp3.
Make SQL script that creates TRACKS, LIKES tables.
Implement following REST API: (current user_id is hardcoded)
3.1 GET /api/tracks
3.2 GET /api/tracks/{id}
3.3 POST /api/tracks
3.4 PUT /api/tracks/{id}
3.5 DELETE /api/tracks/{id}
3.6 POST /api/tracks/{id}/like
3.7 GET /api/tracks?liked=true
3.8 POST /api/tracks/{id}/song mp3 upload.
Current logged in user should be taken into account for
POST /api/tracks/{id}/like
GET /api/tracks?liked=true
Implement page of liked tracks.
Implement tracks page.
Make it responsive, adapt to mobile devices.
