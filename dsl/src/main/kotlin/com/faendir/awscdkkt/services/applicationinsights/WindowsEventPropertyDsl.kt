package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public fun windowsEventProperty(initializer: CfnApplication.WindowsEventProperty.Builder.() -> Unit
    = {}): CfnApplication.WindowsEventProperty =
    CfnApplication.WindowsEventProperty.builder().apply(initializer).build()
