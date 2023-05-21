package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

@Generated
public fun loggingProperty(initializer: CfnStreamingDistribution.LoggingProperty.Builder.() -> Unit
    = {}): CfnStreamingDistribution.LoggingProperty =
    CfnStreamingDistribution.LoggingProperty.builder().apply(initializer).build()
