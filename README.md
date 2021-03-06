# Ultimate Tic-Tac-Toe game

Full description here:
> [https://en.wikipedia.org/wiki/Ultimate_tic-tac-toe](https://en.wikipedia.org/wiki/Ultimate_tic-tac-toe)

First user starts in middle board as 'o' character.
Rest controller can handle a few commands:

### START NEW GAME - PUT:
Everytime you want to start new game you have to confirm.
```sh
localhost:8080/game/new?confirm=yes
```

### SHOW CURRENT GAME STATE - GET:
Returns board lists (9x Board lists with 9x Chararacters lists).
```sh
localhost:8080/game/get
```

### MAKE A MOVE - PUT: 
Make request with two parameters - location (from 1 to 9), also check if player character is correct.
```sh
localhost:8080/game/move?player=o&location=1
```

User should use digits from 1 to 9 when making a move. Also returned location is mapped with:
```
1 | 2 | 3
4 | 5 | 6
7 | 8 | 9
```