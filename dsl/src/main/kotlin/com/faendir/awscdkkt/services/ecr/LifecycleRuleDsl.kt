package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.LifecycleRule

@Generated
public fun lifecycleRule(initializer: LifecycleRule.Builder.() -> Unit = {}): LifecycleRule =
    LifecycleRule.builder().apply(initializer).build()
