@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

public fun httpParametersProperty(initializer: CfnRule.HttpParametersProperty.Builder.() -> Unit):
    CfnRule.HttpParametersProperty =
    CfnRule.HttpParametersProperty.builder().apply(initializer).build()
