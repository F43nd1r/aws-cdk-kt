@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public fun saslProperty(initializer: CfnServerlessCluster.SaslProperty.Builder.() -> Unit):
    CfnServerlessCluster.SaslProperty =
    CfnServerlessCluster.SaslProperty.builder().apply(initializer).build()
