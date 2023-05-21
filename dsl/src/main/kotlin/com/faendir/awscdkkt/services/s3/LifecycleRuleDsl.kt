package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.LifecycleRule

@Generated
public fun lifecycleRule(initializer: LifecycleRule.Builder.() -> Unit = {}): LifecycleRule =
    LifecycleRule.builder().apply(initializer).build()
