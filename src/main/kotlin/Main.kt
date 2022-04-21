fun main() {

    val postOne = Post(
        id = 5,
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
        id = 6,
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
    val postThree = Post(
        id = 8,
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

    var postFour = Post(
        id = 2,
        ownerId = 999,
        fromId = 999,
        createdBy = 999,
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
    val controlTwo = wall.add(postTwo)
    val controlThree = wall.add(postThree)

    wall.update(postFour)

    println(controlOne.id)
    println(controlTwo.id)
    println(controlThree.id)
    println(postFour.id)
    println(wall.update(postFour))
}