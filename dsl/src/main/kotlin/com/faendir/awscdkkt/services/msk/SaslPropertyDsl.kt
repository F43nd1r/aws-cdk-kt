@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public fun saslProperty(initializer: CfnServerlessCluster.SaslProperty.Builder.() -> Unit):
    CfnServerlessCluster.SaslProperty =
    CfnServerlessCluster.SaslProperty.builder().apply(initializer).build()
