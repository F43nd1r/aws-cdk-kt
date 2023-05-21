package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@Generated
public
    fun updatePolicyProperty(initializer: CfnComputeEnvironment.UpdatePolicyProperty.Builder.() -> Unit
    = {}): CfnComputeEnvironment.UpdatePolicyProperty =
    CfnComputeEnvironment.UpdatePolicyProperty.builder().apply(initializer).build()
