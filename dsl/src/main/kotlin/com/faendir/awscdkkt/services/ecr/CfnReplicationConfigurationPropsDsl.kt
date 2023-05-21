package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps

@Generated
public
    fun cfnReplicationConfigurationProps(initializer: CfnReplicationConfigurationProps.Builder.() -> Unit
    = {}): CfnReplicationConfigurationProps =
    CfnReplicationConfigurationProps.builder().apply(initializer).build()
