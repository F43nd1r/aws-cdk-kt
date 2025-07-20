package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnReplicationConfiguration.() -> Unit = {},
): CfnReplicationConfiguration = CfnReplicationConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationConfiguration(id: String, initializer: @AwsCdkDsl CfnReplicationConfiguration.Builder.() -> Unit = {}): CfnReplicationConfiguration = CfnReplicationConfiguration.Builder.create(this, id).apply(initializer).build()
