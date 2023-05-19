@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchFailure

public fun matchFailure(initializer: MatchFailure.Builder.() -> Unit): MatchFailure =
    MatchFailure.builder().apply(initializer).build()
