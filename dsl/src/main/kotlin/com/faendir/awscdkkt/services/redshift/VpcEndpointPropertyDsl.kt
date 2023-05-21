package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@Generated
public fun vpcEndpointProperty(initializer: CfnEndpointAccess.VpcEndpointProperty.Builder.() -> Unit
    = {}): CfnEndpointAccess.VpcEndpointProperty =
    CfnEndpointAccess.VpcEndpointProperty.builder().apply(initializer).build()
