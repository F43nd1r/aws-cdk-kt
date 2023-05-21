package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public
    fun customStepDetailsProperty(initializer: CfnWorkflow.CustomStepDetailsProperty.Builder.() -> Unit
    = {}): CfnWorkflow.CustomStepDetailsProperty =
    CfnWorkflow.CustomStepDetailsProperty.builder().apply(initializer).build()
