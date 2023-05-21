package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public
    fun logDeliveryConfigurationRequestProperty(initializer: CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder.() -> Unit
    = {}): CfnReplicationGroup.LogDeliveryConfigurationRequestProperty =
    CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.builder().apply(initializer).build()
