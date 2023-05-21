package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps

@Generated
public fun cfnClusterSecurityGroupProps(initializer: CfnClusterSecurityGroupProps.Builder.() -> Unit
    = {}): CfnClusterSecurityGroupProps =
    CfnClusterSecurityGroupProps.builder().apply(initializer).build()
