@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnAsset
import software.amazon.awscdk.services.mediapackage.CfnAssetProps
import software.constructs.Construct

public fun Construct.cfnAsset(
  id: String,
  props: CfnAssetProps,
  initializer: CfnAsset.() -> Unit = {},
): CfnAsset = CfnAsset(this, id, props).apply(initializer)
