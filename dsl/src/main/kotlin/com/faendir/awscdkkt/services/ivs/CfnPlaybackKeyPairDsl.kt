package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlaybackKeyPair(id: String, initializer: CfnPlaybackKeyPair.() -> Unit =
    {}): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id).apply(initializer)

@Generated
public fun Construct.cfnPlaybackKeyPair(
  id: String,
  props: CfnPlaybackKeyPairProps,
  initializer: CfnPlaybackKeyPair.() -> Unit = {},
): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id, props).apply(initializer)
