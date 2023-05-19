@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun managedScalingPolicyProperty(initializer: CfnCluster.ManagedScalingPolicyProperty.Builder.() -> Unit):
    CfnCluster.ManagedScalingPolicyProperty =
    CfnCluster.ManagedScalingPolicyProperty.builder().apply(initializer).build()
