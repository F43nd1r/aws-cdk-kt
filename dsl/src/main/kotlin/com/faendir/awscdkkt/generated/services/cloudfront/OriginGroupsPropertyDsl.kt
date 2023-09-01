package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun buildOriginGroupsProperty(initializer: @AwsCdkDsl
    CfnDistribution.OriginGroupsProperty.Builder.() -> Unit = {}):
    CfnDistribution.OriginGroupsProperty =
    CfnDistribution.OriginGroupsProperty.Builder().apply(initializer).build()
