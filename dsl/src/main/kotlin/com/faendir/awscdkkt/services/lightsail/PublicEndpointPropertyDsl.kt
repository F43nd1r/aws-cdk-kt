@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

public
    fun publicEndpointProperty(initializer: CfnContainer.PublicEndpointProperty.Builder.() -> Unit):
    CfnContainer.PublicEndpointProperty =
    CfnContainer.PublicEndpointProperty.builder().apply(initializer).build()
