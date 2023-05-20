@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

public
    fun autoScalingPolicyProperty(initializer: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit):
    CfnGameServerGroup.AutoScalingPolicyProperty =
    CfnGameServerGroup.AutoScalingPolicyProperty.builder().apply(initializer).build()
