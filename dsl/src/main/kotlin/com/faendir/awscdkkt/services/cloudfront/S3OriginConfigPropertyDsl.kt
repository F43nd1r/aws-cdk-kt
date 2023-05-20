@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun s3OriginConfigProperty(initializer: CfnDistribution.S3OriginConfigProperty.Builder.() -> Unit):
    CfnDistribution.S3OriginConfigProperty =
    CfnDistribution.S3OriginConfigProperty.builder().apply(initializer).build()
