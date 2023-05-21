package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

@Generated
public
    fun s3OriginProperty(initializer: CfnStreamingDistribution.S3OriginProperty.Builder.() -> Unit =
    {}): CfnStreamingDistribution.S3OriginProperty =
    CfnStreamingDistribution.S3OriginProperty.builder().apply(initializer).build()
