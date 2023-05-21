package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet

@Generated
public
    fun regionConfigurationProperty(initializer: CfnReplicationSet.RegionConfigurationProperty.Builder.() -> Unit
    = {}): CfnReplicationSet.RegionConfigurationProperty =
    CfnReplicationSet.RegionConfigurationProperty.builder().apply(initializer).build()
