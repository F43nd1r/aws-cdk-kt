@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

public
    fun clientAuthenticationProperty(initializer: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit):
    CfnServerlessCluster.ClientAuthenticationProperty =
    CfnServerlessCluster.ClientAuthenticationProperty.builder().apply(initializer).build()
