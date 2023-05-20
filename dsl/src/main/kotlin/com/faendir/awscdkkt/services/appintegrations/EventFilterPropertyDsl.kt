@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

public
    fun eventFilterProperty(initializer: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit):
    CfnEventIntegration.EventFilterProperty =
    CfnEventIntegration.EventFilterProperty.builder().apply(initializer).build()
