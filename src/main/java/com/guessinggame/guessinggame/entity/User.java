package com.guessinggame.guessinggame.entity;import javax.persistence.*;import javax.validation.constraints.NotBlank;import javax.validation.constraints.Size;import java.util.ArrayList;import java.util.List;@Entity@Table(name = "game_user")public class User {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "user_id")    private long id;    @NotBlank(message = "Username is required")    @Size(min = 3, message = "Username min length is 3 character")    @Column(name = "username")    private String username;    @Column(name = "played_games")    private int playedGames;    @Column(name = "games_win")    private int gamesWin;    public User() {        setPlayedGames(getPlayedGames()+1);    }    public long getId() {        return id;    }    public void setId(long id) {        this.id = id;    }    public void setUsername(String username) {        this.username = username;    }    public String getUsername() {        return username;    }    public int getPlayedGames() {        return playedGames;    }    public void setPlayedGames(int playedGames) {        this.playedGames = playedGames;    }    public int getGamesWin() {        return gamesWin;    }    public void setGamesWin(int gamesWin) {        this.gamesWin = gamesWin;    }    @Override    public String toString() {        return "User{" +                "id=" + id +                ", userName='" + username + '\'' +                ", playedGames=" + playedGames +                ", gamesWin=" + gamesWin +                '}';    }}