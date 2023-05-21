package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun connectionLogOptionsProperty(initializer: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
    CfnClientVpnEndpoint.ConnectionLogOptionsProperty.builder().apply(initializer).build()
