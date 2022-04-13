fun main() {

    val postOne = Post(
        id = 0,
        ownerId = 666,
        fromId = 111,
        createdBy = 5656,
        date = 12042022,
        text = "Sun shine and it is okey",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = "newspaper Pravda",
        likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = "post",
        signerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )

    val postTwo = Post(
        id = 1,
        ownerId = 666,
        fromId = 111,
        createdBy = 5656,
        date = 12042022,
        text = "Sun shine and it is okey",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = "newspaper Pravda",
        likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = "post",
        signerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )


    val wall = WallService()

    val controlOne = wall.add(postOne)
    postTwo.id = controlOne.id
    wall.update(postTwo)

    println(controlOne.id)
    println(postTwo.id)
    println(wall.update(postTwo))
}