package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnVPCConnection

@Generated
public
    fun networkInterfaceProperty(initializer: CfnVPCConnection.NetworkInterfaceProperty.Builder.() -> Unit
    = {}): CfnVPCConnection.NetworkInterfaceProperty =
    CfnVPCConnection.NetworkInterfaceProperty.builder().apply(initializer).build()
