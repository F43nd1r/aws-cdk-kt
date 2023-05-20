@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

public
    fun vpcSecurityGroupProperty(initializer: CfnEndpointAccess.VpcSecurityGroupProperty.Builder.() -> Unit):
    CfnEndpointAccess.VpcSecurityGroupProperty =
    CfnEndpointAccess.VpcSecurityGroupProperty.builder().apply(initializer).build()
