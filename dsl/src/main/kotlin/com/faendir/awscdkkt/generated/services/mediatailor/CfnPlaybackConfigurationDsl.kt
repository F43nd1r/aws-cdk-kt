package com.faendir.awscdkkt.generated.services.mediatailor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaybackConfiguration(
  id: String,
  props: CfnPlaybackConfigurationProps,
  initializer: @AwsCdkDsl CfnPlaybackConfiguration.() -> Unit = {},
): CfnPlaybackConfiguration = CfnPlaybackConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlaybackConfiguration(id: String, initializer: @AwsCdkDsl
    CfnPlaybackConfiguration.Builder.() -> Unit = {}): CfnPlaybackConfiguration =
    CfnPlaybackConfiguration.Builder.create(this, id).apply(initializer).build()
