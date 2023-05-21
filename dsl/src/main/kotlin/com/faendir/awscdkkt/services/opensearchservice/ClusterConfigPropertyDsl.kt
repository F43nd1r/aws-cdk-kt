package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public fun clusterConfigProperty(initializer: CfnDomain.ClusterConfigProperty.Builder.() -> Unit =
    {}): CfnDomain.ClusterConfigProperty =
    CfnDomain.ClusterConfigProperty.builder().apply(initializer).build()
