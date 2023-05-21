package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.BehaviorOptions

@Generated
public fun behaviorOptions(initializer: BehaviorOptions.Builder.() -> Unit = {}): BehaviorOptions =
    BehaviorOptions.builder().apply(initializer).build()
