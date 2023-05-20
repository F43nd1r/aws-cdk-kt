@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRule

public
    fun targetAddressProperty(initializer: CfnResolverRule.TargetAddressProperty.Builder.() -> Unit):
    CfnResolverRule.TargetAddressProperty =
    CfnResolverRule.TargetAddressProperty.builder().apply(initializer).build()
