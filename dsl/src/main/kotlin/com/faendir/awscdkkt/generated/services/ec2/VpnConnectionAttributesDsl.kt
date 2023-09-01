package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnectionAttributes

@Generated
public fun buildVpnConnectionAttributes(initializer: @AwsCdkDsl
    VpnConnectionAttributes.Builder.() -> Unit = {}): VpnConnectionAttributes =
    VpnConnectionAttributes.Builder().apply(initializer).build()
