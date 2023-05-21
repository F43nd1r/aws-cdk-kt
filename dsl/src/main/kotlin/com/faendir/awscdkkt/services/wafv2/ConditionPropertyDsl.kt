package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@Generated
public
    fun conditionProperty(initializer: CfnLoggingConfiguration.ConditionProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.ConditionProperty =
    CfnLoggingConfiguration.ConditionProperty.builder().apply(initializer).build()
