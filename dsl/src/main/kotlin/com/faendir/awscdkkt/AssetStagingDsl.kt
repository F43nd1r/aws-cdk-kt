package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.AssetStagingProps
import software.constructs.Construct

@Generated
public fun Construct.assetStaging(
  id: String,
  props: AssetStagingProps,
  initializer: AssetStaging.() -> Unit = {},
): AssetStaging = AssetStaging(this, id, props).apply(initializer)
