package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchFailure

@Generated
public fun matchFailure(initializer: MatchFailure.Builder.() -> Unit = {}): MatchFailure =
    MatchFailure.builder().apply(initializer).build()
