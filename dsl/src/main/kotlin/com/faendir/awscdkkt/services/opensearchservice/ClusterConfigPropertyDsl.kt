@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

public fun clusterConfigProperty(initializer: CfnDomain.ClusterConfigProperty.Builder.() -> Unit):
    CfnDomain.ClusterConfigProperty =
    CfnDomain.ClusterConfigProperty.builder().apply(initializer).build()
