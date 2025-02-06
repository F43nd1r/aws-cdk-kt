package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun buildVpcOriginConfigProperty(initializer: @AwsCdkDsl
    CfnDistribution.VpcOriginConfigProperty.Builder.() -> Unit = {}):
    CfnDistribution.VpcOriginConfigProperty =
    CfnDistribution.VpcOriginConfigProperty.Builder().apply(initializer).build()
