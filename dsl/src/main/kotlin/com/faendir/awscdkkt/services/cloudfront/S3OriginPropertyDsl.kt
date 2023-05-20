@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

public
    fun s3OriginProperty(initializer: CfnStreamingDistribution.S3OriginProperty.Builder.() -> Unit):
    CfnStreamingDistribution.S3OriginProperty =
    CfnStreamingDistribution.S3OriginProperty.builder().apply(initializer).build()
