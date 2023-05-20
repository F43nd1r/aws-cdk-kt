@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

public
    fun runCommandTargetProperty(initializer: CfnRule.RunCommandTargetProperty.Builder.() -> Unit):
    CfnRule.RunCommandTargetProperty =
    CfnRule.RunCommandTargetProperty.builder().apply(initializer).build()
