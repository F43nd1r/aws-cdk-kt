package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun clientLoginBannerOptionsProperty(initializer: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty =
    CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.builder().apply(initializer).build()
