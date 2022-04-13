internal class WallService {

    internal var postsArray = emptyArray<Post>()

    internal fun add(post: Post): Post {
        val changeId = (1..10000).random()
        val postNew = post.copy(id = changeId)
        postsArray += postNew
        return postsArray.last()

    }

    internal fun update(post: Post): Boolean {
        var change: Boolean = false
        for ((index, value) in postsArray.withIndex()) {
            if (value.id == post.id) {
                postsArray[index] = value.copy(
                    id = post.id,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    copyright = post.copyright,
                    viewsCount = post.viewsCount,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId
                )
                change = true
            } else {
                change = false
            }
        }
        return change

    }
}
