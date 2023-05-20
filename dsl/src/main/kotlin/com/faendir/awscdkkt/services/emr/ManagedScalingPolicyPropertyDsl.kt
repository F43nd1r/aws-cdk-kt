@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun managedScalingPolicyProperty(initializer: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit):
    CfnCluster.ManagedScalingPolicyProperty =
    CfnCluster.ManagedScalingPolicyProperty.builder().apply(initializer).build()
