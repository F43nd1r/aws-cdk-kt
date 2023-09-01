package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun buildCustomOriginConfigProperty(initializer: @AwsCdkDsl
    CfnDistribution.CustomOriginConfigProperty.Builder.() -> Unit = {}):
    CfnDistribution.CustomOriginConfigProperty =
    CfnDistribution.CustomOriginConfigProperty.Builder().apply(initializer).build()
