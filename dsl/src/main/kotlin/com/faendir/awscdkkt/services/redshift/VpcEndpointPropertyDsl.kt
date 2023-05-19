@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

public
    fun vpcEndpointProperty(initializer: CfnEndpointAccess.VpcEndpointProperty.Builder.() -> Unit):
    CfnEndpointAccess.VpcEndpointProperty =
    CfnEndpointAccess.VpcEndpointProperty.builder().apply(initializer).build()
