package com.londonappbrewery.quizzler

import android.support.annotation.StringRes

/**
 * Created by patrick on 11/28/17.
 * 9:40 AM, Notive B.V.
 *
 * © Copyright 2017
 */
class TrueFalse(@StringRes questionId: Int, answer: Boolean) {
    @StringRes
    private val mQuestionId: Int = questionId
    private val mAnswer: Boolean = answer
    @StringRes
    fun getQuestionStringId(): Int = mQuestionId

    fun isAnswer(): Boolean = mAnswer
}