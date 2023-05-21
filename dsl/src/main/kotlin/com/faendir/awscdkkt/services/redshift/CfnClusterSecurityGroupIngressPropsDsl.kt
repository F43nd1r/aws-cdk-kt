package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps

@Generated
public
    fun cfnClusterSecurityGroupIngressProps(initializer: CfnClusterSecurityGroupIngressProps.Builder.() -> Unit
    = {}): CfnClusterSecurityGroupIngressProps =
    CfnClusterSecurityGroupIngressProps.builder().apply(initializer).build()
