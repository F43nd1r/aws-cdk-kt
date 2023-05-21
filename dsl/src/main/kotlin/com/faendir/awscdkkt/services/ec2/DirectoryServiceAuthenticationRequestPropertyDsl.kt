package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun directoryServiceAuthenticationRequestProperty(initializer: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty =
    CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder().apply(initializer).build()
