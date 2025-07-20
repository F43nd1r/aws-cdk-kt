package com.faendir.awscdkkt.generated.services.codestarconnections

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSyncConfiguration(
  id: String,
  props: CfnSyncConfigurationProps,
  initializer: @AwsCdkDsl CfnSyncConfiguration.() -> Unit = {},
): CfnSyncConfiguration = CfnSyncConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSyncConfiguration(id: String, initializer: @AwsCdkDsl CfnSyncConfiguration.Builder.() -> Unit = {}): CfnSyncConfiguration = CfnSyncConfiguration.Builder.create(this, id).apply(initializer).build()
