package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps

@Generated
public fun cfnScalingPolicyProps(initializer: CfnScalingPolicyProps.Builder.() -> Unit = {}):
    CfnScalingPolicyProps = CfnScalingPolicyProps.builder().apply(initializer).build()
