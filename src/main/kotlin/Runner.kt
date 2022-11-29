
fun main() {

    Api.fetchUsers()
        .doOnNext { users -> println("doOnNext of fetchUsers: $users") }

        .flatMapIterable{
                users -> users
        }
        .doOnNext { user -> println(AnsiColors.BLUE + "doOnNext of flatMapIterable: $user"  + AnsiColors.RESET ) }

        .flatMap {
                user -> Api.fetchUserImage(user.id)
        }
        .doOnNext { userImage -> println(AnsiColors.GREEN + "doOnNext of flatMap: $userImage"  + AnsiColors.RESET) }

        .toList()
        .doOnSuccess { userImages -> println("doOnSuccess of toList: $userImages") }

        .subscribe(
            { userImages -> println( "subscribe onSuccess: $userImages"  + AnsiColors.RESET) },
            { throwable -> println("subscribe onError: " + throwable.localizedMessage) }
        )

}