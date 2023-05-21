package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun publicAccessProperty(initializer: CfnCluster.PublicAccessProperty.Builder.() -> Unit =
    {}): CfnCluster.PublicAccessProperty =
    CfnCluster.PublicAccessProperty.builder().apply(initializer).build()
