package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps

@Generated
public fun cfnScalingPolicyProps(initializer: CfnScalingPolicyProps.Builder.() -> Unit = {}):
    CfnScalingPolicyProps = CfnScalingPolicyProps.builder().apply(initializer).build()
