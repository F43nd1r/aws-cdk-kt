@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchFailure

public fun matchFailure(initializer: MatchFailure.Builder.() -> Unit): MatchFailure =
    MatchFailure.builder().apply(initializer).build()
