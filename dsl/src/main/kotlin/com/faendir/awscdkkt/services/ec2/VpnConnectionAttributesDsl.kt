package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnectionAttributes

@Generated
public fun vpnConnectionAttributes(initializer: VpnConnectionAttributes.Builder.() -> Unit = {}):
    VpnConnectionAttributes = VpnConnectionAttributes.builder().apply(initializer).build()
