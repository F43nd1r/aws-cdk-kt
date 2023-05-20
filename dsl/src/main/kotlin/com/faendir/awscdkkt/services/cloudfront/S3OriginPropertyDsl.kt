@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

public
    fun s3OriginProperty(initializer: CfnStreamingDistribution.S3OriginProperty.Builder.() -> Unit):
    CfnStreamingDistribution.S3OriginProperty =
    CfnStreamingDistribution.S3OriginProperty.builder().apply(initializer).build()
