@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnectionOptions

public fun vpnConnectionOptions(initializer: VpnConnectionOptions.Builder.() -> Unit):
    VpnConnectionOptions = VpnConnectionOptions.builder().apply(initializer).build()
