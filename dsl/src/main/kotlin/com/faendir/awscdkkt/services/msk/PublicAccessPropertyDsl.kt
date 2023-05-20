@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public fun publicAccessProperty(initializer: CfnCluster.PublicAccessProperty.Builder.() -> Unit):
    CfnCluster.PublicAccessProperty =
    CfnCluster.PublicAccessProperty.builder().apply(initializer).build()
