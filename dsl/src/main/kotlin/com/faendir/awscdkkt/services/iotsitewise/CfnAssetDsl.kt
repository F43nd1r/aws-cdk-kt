@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAsset
import software.amazon.awscdk.services.iotsitewise.CfnAssetProps
import software.constructs.Construct

public fun Construct.cfnAsset(
  id: String,
  props: CfnAssetProps,
  initializer: CfnAsset.() -> Unit = {},
): CfnAsset = CfnAsset(this, id, props).apply(initializer)
