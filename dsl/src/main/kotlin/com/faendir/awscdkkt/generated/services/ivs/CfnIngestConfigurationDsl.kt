package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnIngestConfiguration
import software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIngestConfiguration(id: String, initializer: @AwsCdkDsl
    CfnIngestConfiguration.() -> Unit = {}): CfnIngestConfiguration = CfnIngestConfiguration(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnIngestConfiguration(
  id: String,
  props: CfnIngestConfigurationProps,
  initializer: @AwsCdkDsl CfnIngestConfiguration.() -> Unit = {},
): CfnIngestConfiguration = CfnIngestConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIngestConfiguration(id: String, initializer: @AwsCdkDsl
    CfnIngestConfiguration.Builder.() -> Unit = {}): CfnIngestConfiguration =
    CfnIngestConfiguration.Builder.create(this, id).apply(initializer).build()
