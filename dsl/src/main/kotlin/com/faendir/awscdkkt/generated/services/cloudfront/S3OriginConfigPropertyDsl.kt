package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun buildS3OriginConfigProperty(initializer: @AwsCdkDsl
    CfnDistribution.S3OriginConfigProperty.Builder.() -> Unit):
    CfnDistribution.S3OriginConfigProperty =
    CfnDistribution.S3OriginConfigProperty.Builder().apply(initializer).build()
