package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint

@Generated
public
    fun ipAddressRequestProperty(initializer: CfnResolverEndpoint.IpAddressRequestProperty.Builder.() -> Unit
    = {}): CfnResolverEndpoint.IpAddressRequestProperty =
    CfnResolverEndpoint.IpAddressRequestProperty.builder().apply(initializer).build()
