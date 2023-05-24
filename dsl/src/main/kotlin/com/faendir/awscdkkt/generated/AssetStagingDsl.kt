package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.AssetStagingProps
import software.constructs.Construct

@Generated
public fun Construct.assetStaging(id: String, props: AssetStagingProps): AssetStaging =
    AssetStaging(this, id, props)

@Generated
public fun Construct.assetStaging(
  id: String,
  props: AssetStagingProps,
  initializer: @AwsCdkDsl AssetStaging.() -> Unit,
): AssetStaging = AssetStaging(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAssetStaging(id: String, initializer: @AwsCdkDsl
    AssetStaging.Builder.() -> Unit): AssetStaging = AssetStaging.Builder.create(this,
    id).apply(initializer).build()
