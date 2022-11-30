import io.reactivex.Observable

object Api {

    fun fetchUsers() : Observable<List<User>> = Observable.just(USERS)

    fun fetchUserImage(userId: Int) : Observable<UserImage> = Observable.just(getUserImage(userId))

    private fun getUserImage(userId: Int): UserImage = UserImage(userId, USERS_IMAGES[userId].toString())

    private val USERS = listOf(
        User(1, "One"), User(2, "Two"), User(3, "Three")
    )

    private val USERS_IMAGES = hashMapOf(
        Pair(1, "photo1"), Pair(2, "photo2"), Pair(3, "photo3")
    )

}
