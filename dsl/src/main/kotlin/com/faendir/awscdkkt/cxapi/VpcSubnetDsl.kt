package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.VpcSubnet

@Generated
public fun vpcSubnet(initializer: VpcSubnet.Builder.() -> Unit = {}): VpcSubnet =
    VpcSubnet.builder().apply(initializer).build()
