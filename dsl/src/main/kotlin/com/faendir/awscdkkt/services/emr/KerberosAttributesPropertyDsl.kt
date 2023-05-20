@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

public
    fun kerberosAttributesProperty(initializer: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit):
    CfnCluster.KerberosAttributesProperty =
    CfnCluster.KerberosAttributesProperty.builder().apply(initializer).build()
