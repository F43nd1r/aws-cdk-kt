package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun autoTerminationPolicyProperty(initializer: CfnCluster.AutoTerminationPolicyProperty.Builder.() -> Unit
    = {}): CfnCluster.AutoTerminationPolicyProperty =
    CfnCluster.AutoTerminationPolicyProperty.builder().apply(initializer).build()
