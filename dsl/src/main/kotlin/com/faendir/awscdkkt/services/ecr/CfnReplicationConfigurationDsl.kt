@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps
import software.constructs.Construct

public fun Construct.cfnReplicationConfiguration(
  id: String,
  props: CfnReplicationConfigurationProps,
  initializer: CfnReplicationConfiguration.() -> Unit = {},
): CfnReplicationConfiguration = CfnReplicationConfiguration(this, id, props).apply(initializer)
