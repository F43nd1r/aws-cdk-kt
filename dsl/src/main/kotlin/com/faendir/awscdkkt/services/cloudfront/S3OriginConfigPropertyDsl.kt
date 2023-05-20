@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun s3OriginConfigProperty(initializer: CfnDistribution.S3OriginConfigProperty.Builder.() -> Unit):
    CfnDistribution.S3OriginConfigProperty =
    CfnDistribution.S3OriginConfigProperty.builder().apply(initializer).build()
