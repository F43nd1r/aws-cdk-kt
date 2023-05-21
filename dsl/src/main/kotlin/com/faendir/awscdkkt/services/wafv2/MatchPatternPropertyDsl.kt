package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@Generated
public
    fun matchPatternProperty(initializer: CfnLoggingConfiguration.MatchPatternProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.MatchPatternProperty =
    CfnLoggingConfiguration.MatchPatternProperty.builder().apply(initializer).build()
