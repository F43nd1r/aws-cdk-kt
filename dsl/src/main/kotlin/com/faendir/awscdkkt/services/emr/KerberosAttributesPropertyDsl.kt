package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun kerberosAttributesProperty(initializer: CfnCluster.KerberosAttributesProperty.Builder.() -> Unit
    = {}): CfnCluster.KerberosAttributesProperty =
    CfnCluster.KerberosAttributesProperty.builder().apply(initializer).build()
