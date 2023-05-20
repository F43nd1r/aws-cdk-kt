@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun originGroupMembersProperty(initializer: CfnDistribution.OriginGroupMembersProperty.Builder.() -> Unit):
    CfnDistribution.OriginGroupMembersProperty =
    CfnDistribution.OriginGroupMembersProperty.builder().apply(initializer).build()
