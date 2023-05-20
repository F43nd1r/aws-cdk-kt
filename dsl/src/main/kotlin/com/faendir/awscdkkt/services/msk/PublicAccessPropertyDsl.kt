@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public fun publicAccessProperty(initializer: CfnCluster.PublicAccessProperty.Builder.() -> Unit):
    CfnCluster.PublicAccessProperty =
    CfnCluster.PublicAccessProperty.builder().apply(initializer).build()
