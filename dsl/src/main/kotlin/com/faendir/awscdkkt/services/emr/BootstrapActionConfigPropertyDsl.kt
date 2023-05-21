package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public
    fun bootstrapActionConfigProperty(initializer: CfnCluster.BootstrapActionConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.BootstrapActionConfigProperty =
    CfnCluster.BootstrapActionConfigProperty.builder().apply(initializer).build()
