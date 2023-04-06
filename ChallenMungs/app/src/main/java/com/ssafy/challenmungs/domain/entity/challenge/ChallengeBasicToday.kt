package com.ssafy.challenmungs.domain.entity.challenge

data class ChallengeBasicToday(
    val boardId: Int,
    val myRejectState: Boolean,
    val memberId: String,
    val memberName: String,
    val profileUrl: String,
    val challengeImageUrl: String,
)