package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public fun computeLimitsProperty(initializer: CfnCluster.ComputeLimitsProperty.Builder.() -> Unit =
    {}): CfnCluster.ComputeLimitsProperty =
    CfnCluster.ComputeLimitsProperty.builder().apply(initializer).build()
