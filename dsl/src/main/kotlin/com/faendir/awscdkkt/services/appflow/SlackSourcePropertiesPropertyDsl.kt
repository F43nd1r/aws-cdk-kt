package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun slackSourcePropertiesProperty(initializer: CfnFlow.SlackSourcePropertiesProperty.Builder.() -> Unit
    = {}): CfnFlow.SlackSourcePropertiesProperty =
    CfnFlow.SlackSourcePropertiesProperty.builder().apply(initializer).build()
