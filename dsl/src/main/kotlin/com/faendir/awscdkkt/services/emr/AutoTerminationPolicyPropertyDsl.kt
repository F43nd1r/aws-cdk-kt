@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun autoTerminationPolicyProperty(initializer: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit):
    CfnCluster.AutoTerminationPolicyProperty =
    CfnCluster.AutoTerminationPolicyProperty.builder().apply(initializer).build()
