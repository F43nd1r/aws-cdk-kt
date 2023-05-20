@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun legacyS3OriginProperty(initializer: CfnDistribution.LegacyS3OriginProperty.Builder.() -> Unit):
    CfnDistribution.LegacyS3OriginProperty =
    CfnDistribution.LegacyS3OriginProperty.builder().apply(initializer).build()
