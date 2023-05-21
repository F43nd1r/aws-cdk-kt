package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

@Generated
public
    fun eventFilterProperty(initializer: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit
    = {}): CfnEventIntegration.EventFilterProperty =
    CfnEventIntegration.EventFilterProperty.builder().apply(initializer).build()
