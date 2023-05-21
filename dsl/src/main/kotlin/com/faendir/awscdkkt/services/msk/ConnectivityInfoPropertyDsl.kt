package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun connectivityInfoProperty(initializer: CfnCluster.ConnectivityInfoProperty.Builder.() -> Unit
    = {}): CfnCluster.ConnectivityInfoProperty =
    CfnCluster.ConnectivityInfoProperty.builder().apply(initializer).build()
