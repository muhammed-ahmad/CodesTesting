import io.reactivex.Observable

object Api {

    fun fetchUsers() : Observable<List<User>> = Observable.just(USERS)

    fun fetchUserImage(id: Int) : Observable<UserImage> = Observable.just(getUserImage(id))

    private fun getUserImage(userId: Int): UserImage = UserImage(userId, USERS_IMAGES[userId].toString())

    private val USERS = listOf(
        User(1, "One"), User(2, "Two"), User(3, "Three")
    )

    private val USERS_IMAGES = hashMapOf(
        Pair(1, "photo-1"), Pair(2, "photo-2"), Pair(3, "photo-3")
    )

}