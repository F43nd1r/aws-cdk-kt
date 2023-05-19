@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public fun iamProperty(initializer: CfnServerlessCluster.IamProperty.Builder.() -> Unit):
    CfnServerlessCluster.IamProperty =
    CfnServerlessCluster.IamProperty.builder().apply(initializer).build()
