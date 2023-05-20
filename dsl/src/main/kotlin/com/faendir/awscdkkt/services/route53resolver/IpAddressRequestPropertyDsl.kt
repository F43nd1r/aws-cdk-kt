@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint

public
    fun ipAddressRequestProperty(initializer: CfnResolverEndpoint.IpAddressRequestProperty.Builder.() -> Unit):
    CfnResolverEndpoint.IpAddressRequestProperty =
    CfnResolverEndpoint.IpAddressRequestProperty.builder().apply(initializer).build()
