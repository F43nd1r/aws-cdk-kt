package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationAggregator(id: String, initializer: @AwsCdkDsl
    CfnConfigurationAggregator.() -> Unit = {}): CfnConfigurationAggregator =
    CfnConfigurationAggregator(this, id).apply(initializer)

@Generated
public fun Construct.cfnConfigurationAggregator(
  id: String,
  props: CfnConfigurationAggregatorProps,
  initializer: @AwsCdkDsl CfnConfigurationAggregator.() -> Unit = {},
): CfnConfigurationAggregator = CfnConfigurationAggregator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationAggregator(id: String, initializer: @AwsCdkDsl
    CfnConfigurationAggregator.Builder.() -> Unit = {}): CfnConfigurationAggregator =
    CfnConfigurationAggregator.Builder.create(this, id).apply(initializer).build()
