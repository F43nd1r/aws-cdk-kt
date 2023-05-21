package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions

@Generated
public fun utilizationScalingOptions(initializer: UtilizationScalingOptions.Builder.() -> Unit =
    {}): UtilizationScalingOptions = UtilizationScalingOptions.builder().apply(initializer).build()
