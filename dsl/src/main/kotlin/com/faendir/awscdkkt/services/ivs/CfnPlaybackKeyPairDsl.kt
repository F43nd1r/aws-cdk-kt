@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
import software.constructs.Construct

public fun Construct.cfnPlaybackKeyPair(id: String, initializer: CfnPlaybackKeyPair.() -> Unit =
    {}): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id).apply(initializer)

public fun Construct.cfnPlaybackKeyPair(
  id: String,
  props: CfnPlaybackKeyPairProps,
  initializer: CfnPlaybackKeyPair.() -> Unit = {},
): CfnPlaybackKeyPair = CfnPlaybackKeyPair(this, id, props).apply(initializer)
