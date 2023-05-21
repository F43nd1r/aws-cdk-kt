package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnet

@Generated
public
    fun privateDnsNameOptionsOnLaunchProperty(initializer: CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.Builder.() -> Unit
    = {}): CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty =
    CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.builder().apply(initializer).build()
