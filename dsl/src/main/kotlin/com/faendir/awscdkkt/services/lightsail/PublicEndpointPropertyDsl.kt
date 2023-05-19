@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

public
    fun publicEndpointProperty(initializer: CfnContainer.PublicEndpointProperty.Builder.() -> Unit):
    CfnContainer.PublicEndpointProperty =
    CfnContainer.PublicEndpointProperty.builder().apply(initializer).build()
