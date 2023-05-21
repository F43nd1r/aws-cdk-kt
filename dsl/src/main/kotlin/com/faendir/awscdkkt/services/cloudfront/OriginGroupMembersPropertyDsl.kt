package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun originGroupMembersProperty(initializer: CfnDistribution.OriginGroupMembersProperty.Builder.() -> Unit
    = {}): CfnDistribution.OriginGroupMembersProperty =
    CfnDistribution.OriginGroupMembersProperty.builder().apply(initializer).build()
