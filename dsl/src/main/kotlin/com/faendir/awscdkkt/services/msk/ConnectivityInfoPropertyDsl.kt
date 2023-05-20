@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun connectivityInfoProperty(initializer: CfnCluster.ConnectivityInfoProperty.Builder.() -> Unit):
    CfnCluster.ConnectivityInfoProperty =
    CfnCluster.ConnectivityInfoProperty.builder().apply(initializer).build()
