@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

public
    fun serviceConnectDefaultsProperty(initializer: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit):
    CfnCluster.ServiceConnectDefaultsProperty =
    CfnCluster.ServiceConnectDefaultsProperty.builder().apply(initializer).build()
