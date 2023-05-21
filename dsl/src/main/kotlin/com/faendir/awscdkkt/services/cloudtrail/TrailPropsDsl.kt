package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.TrailProps

@Generated
public fun trailProps(initializer: TrailProps.Builder.() -> Unit = {}): TrailProps =
    TrailProps.builder().apply(initializer).build()
