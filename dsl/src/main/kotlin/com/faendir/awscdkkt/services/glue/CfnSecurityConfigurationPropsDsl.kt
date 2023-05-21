package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps

@Generated
public
    fun cfnSecurityConfigurationProps(initializer: CfnSecurityConfigurationProps.Builder.() -> Unit
    = {}): CfnSecurityConfigurationProps =
    CfnSecurityConfigurationProps.builder().apply(initializer).build()
