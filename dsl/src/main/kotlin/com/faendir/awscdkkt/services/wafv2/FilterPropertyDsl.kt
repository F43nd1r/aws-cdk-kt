package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@Generated
public fun filterProperty(initializer: CfnLoggingConfiguration.FilterProperty.Builder.() -> Unit =
    {}): CfnLoggingConfiguration.FilterProperty =
    CfnLoggingConfiguration.FilterProperty.builder().apply(initializer).build()
