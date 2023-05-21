package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public
    fun customComponentProperty(initializer: CfnApplication.CustomComponentProperty.Builder.() -> Unit
    = {}): CfnApplication.CustomComponentProperty =
    CfnApplication.CustomComponentProperty.builder().apply(initializer).build()
