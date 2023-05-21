package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun ssmAutomationProperty(initializer: CfnResponsePlan.SsmAutomationProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.SsmAutomationProperty =
    CfnResponsePlan.SsmAutomationProperty.builder().apply(initializer).build()
