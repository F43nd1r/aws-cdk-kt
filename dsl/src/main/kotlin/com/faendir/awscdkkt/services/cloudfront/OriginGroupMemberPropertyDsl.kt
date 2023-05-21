package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun originGroupMemberProperty(initializer: CfnDistribution.OriginGroupMemberProperty.Builder.() -> Unit
    = {}): CfnDistribution.OriginGroupMemberProperty =
    CfnDistribution.OriginGroupMemberProperty.builder().apply(initializer).build()
