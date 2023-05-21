package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

@Generated
public
    fun trustedSignersProperty(initializer: CfnStreamingDistribution.TrustedSignersProperty.Builder.() -> Unit
    = {}): CfnStreamingDistribution.TrustedSignersProperty =
    CfnStreamingDistribution.TrustedSignersProperty.builder().apply(initializer).build()
