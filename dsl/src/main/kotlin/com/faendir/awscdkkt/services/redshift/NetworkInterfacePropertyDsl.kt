package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@Generated
public
    fun networkInterfaceProperty(initializer: CfnEndpointAccess.NetworkInterfaceProperty.Builder.() -> Unit
    = {}): CfnEndpointAccess.NetworkInterfaceProperty =
    CfnEndpointAccess.NetworkInterfaceProperty.builder().apply(initializer).build()
