package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

@Generated
public
    fun regionalConfigurationProperty(initializer: CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder.() -> Unit
    = {}): CfnGlobalReplicationGroup.RegionalConfigurationProperty =
    CfnGlobalReplicationGroup.RegionalConfigurationProperty.builder().apply(initializer).build()
