@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

public
    fun kinesisParametersProperty(initializer: CfnRule.KinesisParametersProperty.Builder.() -> Unit):
    CfnRule.KinesisParametersProperty =
    CfnRule.KinesisParametersProperty.builder().apply(initializer).build()
