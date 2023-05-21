package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@Generated
public
    fun vpcSecurityGroupProperty(initializer: CfnEndpointAccess.VpcSecurityGroupProperty.Builder.() -> Unit
    = {}): CfnEndpointAccess.VpcSecurityGroupProperty =
    CfnEndpointAccess.VpcSecurityGroupProperty.builder().apply(initializer).build()
