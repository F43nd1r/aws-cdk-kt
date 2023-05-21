package com.faendir.awscdkkt.services.dax

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster

@Generated
public
    fun sSESpecificationProperty(initializer: CfnCluster.SSESpecificationProperty.Builder.() -> Unit
    = {}): CfnCluster.SSESpecificationProperty =
    CfnCluster.SSESpecificationProperty.builder().apply(initializer).build()
