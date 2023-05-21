package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps

@Generated
public
    fun cfnEndpointAuthorizationProps(initializer: CfnEndpointAuthorizationProps.Builder.() -> Unit
    = {}): CfnEndpointAuthorizationProps =
    CfnEndpointAuthorizationProps.builder().apply(initializer).build()
