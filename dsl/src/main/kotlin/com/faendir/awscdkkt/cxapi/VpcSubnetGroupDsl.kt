package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.VpcSubnetGroup

@Generated
public fun vpcSubnetGroup(initializer: VpcSubnetGroup.Builder.() -> Unit = {}): VpcSubnetGroup =
    VpcSubnetGroup.builder().apply(initializer).build()
