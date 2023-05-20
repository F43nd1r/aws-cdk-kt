@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRule

public
    fun targetAddressProperty(initializer: CfnResolverRule.TargetAddressProperty.Builder.() -> Unit):
    CfnResolverRule.TargetAddressProperty =
    CfnResolverRule.TargetAddressProperty.builder().apply(initializer).build()
