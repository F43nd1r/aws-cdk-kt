package com.faendir.awscdkkt.generated.services.mediapackage

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnAsset
import software.amazon.awscdk.services.mediapackage.CfnAssetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAsset(id: String, props: CfnAssetProps): CfnAsset = CfnAsset(this, id,
    props)

@Generated
public fun Construct.cfnAsset(
  id: String,
  props: CfnAssetProps,
  initializer: @AwsCdkDsl CfnAsset.() -> Unit,
): CfnAsset = CfnAsset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAsset(id: String, initializer: @AwsCdkDsl CfnAsset.Builder.() -> Unit):
    CfnAsset = CfnAsset.Builder.create(this, id).apply(initializer).build()
