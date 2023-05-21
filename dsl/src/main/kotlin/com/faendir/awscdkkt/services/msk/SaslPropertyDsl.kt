package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@Generated
public fun saslProperty(initializer: CfnServerlessCluster.SaslProperty.Builder.() -> Unit = {}):
    CfnServerlessCluster.SaslProperty =
    CfnServerlessCluster.SaslProperty.builder().apply(initializer).build()
