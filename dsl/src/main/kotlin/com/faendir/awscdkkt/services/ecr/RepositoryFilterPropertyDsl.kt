package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public
    fun repositoryFilterProperty(initializer: CfnReplicationConfiguration.RepositoryFilterProperty.Builder.() -> Unit
    = {}): CfnReplicationConfiguration.RepositoryFilterProperty =
    CfnReplicationConfiguration.RepositoryFilterProperty.builder().apply(initializer).build()
