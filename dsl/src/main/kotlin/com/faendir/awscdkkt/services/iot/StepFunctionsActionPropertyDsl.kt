package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun stepFunctionsActionProperty(initializer: CfnTopicRule.StepFunctionsActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.StepFunctionsActionProperty =
    CfnTopicRule.StepFunctionsActionProperty.builder().apply(initializer).build()
