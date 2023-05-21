package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@Generated
public
    fun actionConditionProperty(initializer: CfnLoggingConfiguration.ActionConditionProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.ActionConditionProperty =
    CfnLoggingConfiguration.ActionConditionProperty.builder().apply(initializer).build()
