@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

public
    fun conditionProperty(initializer: CfnLoggingConfiguration.ConditionProperty.Builder.() -> Unit):
    CfnLoggingConfiguration.ConditionProperty =
    CfnLoggingConfiguration.ConditionProperty.builder().apply(initializer).build()
