@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public fun iamProperty(initializer: CfnServerlessCluster.IamProperty.Builder.() -> Unit):
    CfnServerlessCluster.IamProperty =
    CfnServerlessCluster.IamProperty.builder().apply(initializer).build()
