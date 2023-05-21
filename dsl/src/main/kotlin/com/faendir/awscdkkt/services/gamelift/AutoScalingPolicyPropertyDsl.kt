package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@Generated
public
    fun autoScalingPolicyProperty(initializer: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit
    = {}): CfnGameServerGroup.AutoScalingPolicyProperty =
    CfnGameServerGroup.AutoScalingPolicyProperty.builder().apply(initializer).build()
