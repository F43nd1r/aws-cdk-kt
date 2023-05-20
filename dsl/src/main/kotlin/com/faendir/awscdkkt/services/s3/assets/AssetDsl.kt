@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3.assets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.Asset
import software.amazon.awscdk.services.s3.assets.AssetProps
import software.constructs.Construct

public fun Construct.asset(
  id: String,
  props: AssetProps,
  initializer: Asset.() -> Unit = {},
): Asset = Asset(this, id, props).apply(initializer)
