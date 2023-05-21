package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnectionProps

@Generated
public fun vpnConnectionProps(initializer: VpnConnectionProps.Builder.() -> Unit = {}):
    VpnConnectionProps = VpnConnectionProps.builder().apply(initializer).build()
