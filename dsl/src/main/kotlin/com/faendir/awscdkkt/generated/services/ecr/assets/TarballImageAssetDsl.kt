package com.faendir.awscdkkt.generated.services.ecr.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.TarballImageAsset
import software.amazon.awscdk.services.ecr.assets.TarballImageAssetProps
import software.constructs.Construct

@Generated
public fun Construct.tarballImageAsset(
  id: String,
  props: TarballImageAssetProps,
  initializer: @AwsCdkDsl TarballImageAsset.() -> Unit = {},
): TarballImageAsset = TarballImageAsset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTarballImageAsset(id: String, initializer: @AwsCdkDsl TarballImageAsset.Builder.() -> Unit = {}): TarballImageAsset = TarballImageAsset.Builder.create(this, id).apply(initializer).build()
