package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@Generated
public
    fun certificateAuthenticationRequestProperty(initializer: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder.() -> Unit
    = {}): CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty =
    CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.builder().apply(initializer).build()
