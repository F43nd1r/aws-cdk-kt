package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

@Generated
public
    fun portOverrideProperty(initializer: CfnEndpointGroup.PortOverrideProperty.Builder.() -> Unit =
    {}): CfnEndpointGroup.PortOverrideProperty =
    CfnEndpointGroup.PortOverrideProperty.builder().apply(initializer).build()
