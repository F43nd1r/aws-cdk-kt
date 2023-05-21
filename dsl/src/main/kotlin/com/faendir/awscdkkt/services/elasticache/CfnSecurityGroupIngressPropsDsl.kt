package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps

@Generated
public fun cfnSecurityGroupIngressProps(initializer: CfnSecurityGroupIngressProps.Builder.() -> Unit
    = {}): CfnSecurityGroupIngressProps =
    CfnSecurityGroupIngressProps.builder().apply(initializer).build()
