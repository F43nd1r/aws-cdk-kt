package com.faendir.awscdkkt.generated.assertions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchFailure

@Generated
public fun buildMatchFailure(initializer: @AwsCdkDsl MatchFailure.Builder.() -> Unit = {}):
    MatchFailure = MatchFailure.Builder().apply(initializer).build()
