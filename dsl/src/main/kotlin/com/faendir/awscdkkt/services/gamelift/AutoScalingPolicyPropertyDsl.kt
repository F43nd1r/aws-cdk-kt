@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

public
    fun autoScalingPolicyProperty(initializer: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit):
    CfnGameServerGroup.AutoScalingPolicyProperty =
    CfnGameServerGroup.AutoScalingPolicyProperty.builder().apply(initializer).build()
