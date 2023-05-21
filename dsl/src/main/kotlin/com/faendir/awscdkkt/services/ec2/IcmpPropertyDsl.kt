package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry

@Generated
public fun icmpProperty(initializer: CfnNetworkAclEntry.IcmpProperty.Builder.() -> Unit = {}):
    CfnNetworkAclEntry.IcmpProperty =
    CfnNetworkAclEntry.IcmpProperty.builder().apply(initializer).build()
