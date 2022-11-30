
fun main() {

    Api.fetchUsers()
        .doOnNext { users -> println("fetchUsers stream: $users") }

        .flatMapIterable{
                users -> users
        }
        .doOnNext { user -> println(AnsiColors.BLUE + "flatMapIterable stream: $user"  + AnsiColors.RESET ) }

        .flatMap {
                user -> Api.fetchUserImage(user.id)
        }
        .doOnNext { userImage -> println(AnsiColors.GREEN + "flatMap stream: $userImage"  + AnsiColors.RESET) }

        .toList()
        .doOnSuccess { userImages -> println("toList stream: $userImages") }

        .subscribe(
            { userImages -> println( "subscribe onSuccess: $userImages") },
            { throwable -> println("subscribe onError: " + throwable.localizedMessage) }
        )

}