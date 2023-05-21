package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRule

@Generated
public
    fun targetAddressProperty(initializer: CfnResolverRule.TargetAddressProperty.Builder.() -> Unit
    = {}): CfnResolverRule.TargetAddressProperty =
    CfnResolverRule.TargetAddressProperty.builder().apply(initializer).build()
