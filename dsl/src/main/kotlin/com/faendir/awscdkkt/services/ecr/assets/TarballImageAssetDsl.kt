@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
import software.constructs.Construct

public fun Construct.tarballImageAsset(
  id: String,
  props: TarballImageAssetProps,
  initializer: TarballImageAsset.() -> Unit = {},
): TarballImageAsset = TarballImageAsset(this, id, props).apply(initializer)
