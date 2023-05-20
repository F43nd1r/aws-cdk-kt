@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

public
    fun endpointConfigurationProperty(initializer: CfnEndpointGroup.EndpointConfigurationProperty.Builder.() -> Unit):
    CfnEndpointGroup.EndpointConfigurationProperty =
    CfnEndpointGroup.EndpointConfigurationProperty.builder().apply(initializer).build()
