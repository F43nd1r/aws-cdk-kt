@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun originGroupMembersProperty(initializer: CfnDistribution.OriginGroupMembersProperty.Builder.() -> Unit):
    CfnDistribution.OriginGroupMembersProperty =
    CfnDistribution.OriginGroupMembersProperty.builder().apply(initializer).build()
