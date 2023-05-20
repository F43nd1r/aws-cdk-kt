@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.TrailProps

public fun trailProps(initializer: TrailProps.Builder.() -> Unit): TrailProps =
    TrailProps.builder().apply(initializer).build()
