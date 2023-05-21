package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public fun applicationProperty(initializer: CfnCluster.ApplicationProperty.Builder.() -> Unit = {}):
    CfnCluster.ApplicationProperty =
    CfnCluster.ApplicationProperty.builder().apply(initializer).build()
