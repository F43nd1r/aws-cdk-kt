@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint

public
    fun ipAddressRequestProperty(initializer: CfnResolverEndpoint.IpAddressRequestProperty.Builder.() -> Unit):
    CfnResolverEndpoint.IpAddressRequestProperty =
    CfnResolverEndpoint.IpAddressRequestProperty.builder().apply(initializer).build()
