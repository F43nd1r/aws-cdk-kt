package com.faendir.awscdkkt.generated.services.s3.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.Asset
import software.amazon.awscdk.services.s3.assets.AssetProps
import software.constructs.Construct

@Generated
public fun Construct.asset(
  id: String,
  props: AssetProps,
  initializer: @AwsCdkDsl Asset.() -> Unit = {},
): Asset = Asset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAsset(id: String, initializer: @AwsCdkDsl Asset.Builder.() -> Unit = {}):
    Asset = Asset.Builder.create(this, id).apply(initializer).build()
