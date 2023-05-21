package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@Generated
public
    fun clientAuthenticationProperty(initializer: CfnServerlessCluster.ClientAuthenticationProperty.Builder.() -> Unit
    = {}): CfnServerlessCluster.ClientAuthenticationProperty =
    CfnServerlessCluster.ClientAuthenticationProperty.builder().apply(initializer).build()
