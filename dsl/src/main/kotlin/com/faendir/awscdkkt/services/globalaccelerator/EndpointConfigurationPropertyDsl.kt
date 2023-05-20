@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

public
    fun endpointConfigurationProperty(initializer: CfnEndpointGroup.EndpointConfigurationProperty.Builder.() -> Unit):
    CfnEndpointGroup.EndpointConfigurationProperty =
    CfnEndpointGroup.EndpointConfigurationProperty.builder().apply(initializer).build()
