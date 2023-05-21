package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public fun logPatternProperty(initializer: CfnApplication.LogPatternProperty.Builder.() -> Unit =
    {}): CfnApplication.LogPatternProperty =
    CfnApplication.LogPatternProperty.builder().apply(initializer).build()
