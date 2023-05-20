@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

public
    fun trustedSignersProperty(initializer: CfnStreamingDistribution.TrustedSignersProperty.Builder.() -> Unit):
    CfnStreamingDistribution.TrustedSignersProperty =
    CfnStreamingDistribution.TrustedSignersProperty.builder().apply(initializer).build()
