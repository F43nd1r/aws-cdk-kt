@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

public
    fun conditionProperty(initializer: CfnLoggingConfiguration.ConditionProperty.Builder.() -> Unit):
    CfnLoggingConfiguration.ConditionProperty =
    CfnLoggingConfiguration.ConditionProperty.builder().apply(initializer).build()
