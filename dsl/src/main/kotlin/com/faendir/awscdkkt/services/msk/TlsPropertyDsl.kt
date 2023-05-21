package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun tlsProperty(initializer: CfnCluster.TlsProperty.Builder.() -> Unit = {}):
    CfnCluster.TlsProperty = CfnCluster.TlsProperty.builder().apply(initializer).build()
