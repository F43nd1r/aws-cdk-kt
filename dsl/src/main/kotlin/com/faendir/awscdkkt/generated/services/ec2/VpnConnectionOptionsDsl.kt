package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnectionOptions

@Generated
public fun buildVpnConnectionOptions(initializer: @AwsCdkDsl
    VpnConnectionOptions.Builder.() -> Unit): VpnConnectionOptions =
    VpnConnectionOptions.Builder().apply(initializer).build()
