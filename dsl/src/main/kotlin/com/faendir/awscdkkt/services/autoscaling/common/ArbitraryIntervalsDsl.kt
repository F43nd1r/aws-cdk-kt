package com.faendir.awscdkkt.services.autoscaling.common

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals

@Generated
public fun arbitraryIntervals(initializer: ArbitraryIntervals.Builder.() -> Unit = {}):
    ArbitraryIntervals = ArbitraryIntervals.builder().apply(initializer).build()
