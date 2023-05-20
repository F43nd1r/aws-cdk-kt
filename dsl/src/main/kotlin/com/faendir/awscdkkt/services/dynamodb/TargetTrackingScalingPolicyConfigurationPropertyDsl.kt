@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun targetTrackingScalingPolicyConfigurationProperty(initializer: CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
    CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty =
    CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder().apply(initializer).build()
