import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_PostsNotZero() {
        val service = WallService()
        val post = Post(
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
        service.add(post)
        val result = service.add(post).id
        val notZero: Boolean
        if (result > 0) notZero = true else notZero = false
        assertEquals(false, notZero)
    }

    @Test
    fun update_postsEquals() {
        val service = WallService()
        val post1 = Post(
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
        val post2 = Post(
            id = 1,
            ownerId = 889,
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
        val post3 = Post(
            id = 2,
            ownerId = 232,
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
        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = Post(
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
        update.id = service.add(post1).id
        val result = service.update(update)
        assertEquals(true, result)
    }

    @Test
    fun update_postsNotEquals() {
        val service = WallService()
        val post1 = Post(
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
        val post2 = Post(
            id = 1,
            ownerId = 889,
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
        val post3 = Post(
            id = 2,
            ownerId = 232,
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
        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = Post(
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
        val result = service.update(update)
        assertEquals(false, result)
    }
}