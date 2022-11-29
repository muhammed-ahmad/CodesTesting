
# about:

in the kotlin file [Runner.kt](../src/main/kotlin/Runner.kt)
i test the conjuction of the three rxjava operators:
`flatMapIterable`
`flatMap`
`toList`

# output:

doOnNext of fetchUsers: [User(id=1, name=One), User(id=2, name=Two), User(id=3, name=Three)]
<br />
<span style="color:green;">doOnNext of flatMapIterable: User(id=1, name=One) </span>
<br />
<span style="color:blue;">doOnNext of flatMap: UserImage(userId=1, image=photo-1)
<br />
<span style="color:green;"> doOnNext of flatMapIterable: User(id=2, name=Two)</span>
<br />
<span style="color:blue;">
doOnNext of flatMap: UserImage(userId=2, image=photo-2)</span>
<br />
<span style="color:green;">doOnNext of flatMapIterable: User(id=3, name=Three)</span>
<br />
<span style="color:blue;">
doOnNext of flatMap: UserImage(userId=3, image=photo-3) </span>
<br />
doOnSuccess of toList: [UserImage(userId=1, image=photo-1), UserImage(userId=2, image=photo-2), UserImage(userId=3, image=photo-3)]
subscribe onSuccess: [UserImage(userId=1, image=photo-1), UserImage(userId=2, image=photo-2), UserImage(userId=3, image=photo-3)]

