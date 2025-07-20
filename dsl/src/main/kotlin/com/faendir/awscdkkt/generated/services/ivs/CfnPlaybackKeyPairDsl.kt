package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaybackKeyPair(id: String, initializer: @AwsCdkDsl CfnPlaybackKeyPair.() -> Unit = {}): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id).apply(initializer)

@Generated
public fun Construct.cfnPlaybackKeyPair(
  id: String,
  props: CfnPlaybackKeyPairProps,
  initializer: @AwsCdkDsl CfnPlaybackKeyPair.() -> Unit = {},
): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlaybackKeyPair(id: String, initializer: @AwsCdkDsl CfnPlaybackKeyPair.Builder.() -> Unit = {}): CfnPlaybackKeyPair = CfnPlaybackKeyPair.Builder.create(this, id).apply(initializer).build()
