@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public
    fun vpcConfigProperty(initializer: CfnServerlessCluster.VpcConfigProperty.Builder.() -> Unit):
    CfnServerlessCluster.VpcConfigProperty =
    CfnServerlessCluster.VpcConfigProperty.builder().apply(initializer).build()
