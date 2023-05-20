@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

public
    fun eventFilterProperty(initializer: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit):
    CfnEventIntegration.EventFilterProperty =
    CfnEventIntegration.EventFilterProperty.builder().apply(initializer).build()
