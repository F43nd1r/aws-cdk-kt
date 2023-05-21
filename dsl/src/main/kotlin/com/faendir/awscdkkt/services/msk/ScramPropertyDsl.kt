package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun scramProperty(initializer: CfnCluster.ScramProperty.Builder.() -> Unit = {}):
    CfnCluster.ScramProperty = CfnCluster.ScramProperty.builder().apply(initializer).build()
