package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationConfiguration(
  id: String,
  props: CfnReplicationConfigurationProps,
  initializer: CfnReplicationConfiguration.() -> Unit = {},
): CfnReplicationConfiguration = CfnReplicationConfiguration(this, id, props).apply(initializer)
