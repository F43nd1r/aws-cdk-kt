package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.BetweenCondition

@Generated
public fun betweenCondition(initializer: BetweenCondition.Builder.() -> Unit = {}): BetweenCondition
    = BetweenCondition.builder().apply(initializer).build()
