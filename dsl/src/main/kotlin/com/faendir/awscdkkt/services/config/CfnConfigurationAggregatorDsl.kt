package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationAggregator(id: String,
    initializer: CfnConfigurationAggregator.() -> Unit = {}): CfnConfigurationAggregator =
    CfnConfigurationAggregator(this, id).apply(initializer)

@Generated
public fun Construct.cfnConfigurationAggregator(
  id: String,
  props: CfnConfigurationAggregatorProps,
  initializer: CfnConfigurationAggregator.() -> Unit = {},
): CfnConfigurationAggregator = CfnConfigurationAggregator(this, id, props).apply(initializer)
