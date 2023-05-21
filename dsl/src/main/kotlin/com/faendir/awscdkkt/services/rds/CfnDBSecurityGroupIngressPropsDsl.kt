package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps

@Generated
public
    fun cfnDBSecurityGroupIngressProps(initializer: CfnDBSecurityGroupIngressProps.Builder.() -> Unit
    = {}): CfnDBSecurityGroupIngressProps =
    CfnDBSecurityGroupIngressProps.builder().apply(initializer).build()
