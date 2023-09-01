package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions

@Generated
public fun buildClientVpnEndpointOptions(initializer: @AwsCdkDsl
    ClientVpnEndpointOptions.Builder.() -> Unit = {}): ClientVpnEndpointOptions =
    ClientVpnEndpointOptions.Builder().apply(initializer).build()
