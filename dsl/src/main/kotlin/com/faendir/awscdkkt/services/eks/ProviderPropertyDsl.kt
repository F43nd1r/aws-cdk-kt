package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun providerProperty(initializer: CfnCluster.ProviderProperty.Builder.() -> Unit = {}):
    CfnCluster.ProviderProperty = CfnCluster.ProviderProperty.builder().apply(initializer).build()
