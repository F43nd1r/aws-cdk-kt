package com.faendir.awscdkkt.services.redshiftserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@Generated
public
    fun networkInterfaceProperty(initializer: CfnWorkgroup.NetworkInterfaceProperty.Builder.() -> Unit
    = {}): CfnWorkgroup.NetworkInterfaceProperty =
    CfnWorkgroup.NetworkInterfaceProperty.builder().apply(initializer).build()
