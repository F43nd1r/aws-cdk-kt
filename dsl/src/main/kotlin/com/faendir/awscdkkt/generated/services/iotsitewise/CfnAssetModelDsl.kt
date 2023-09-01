package com.faendir.awscdkkt.generated.services.iotsitewise

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssetModel(
  id: String,
  props: CfnAssetModelProps,
  initializer: @AwsCdkDsl CfnAssetModel.() -> Unit = {},
): CfnAssetModel = CfnAssetModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssetModel(id: String, initializer: @AwsCdkDsl
    CfnAssetModel.Builder.() -> Unit = {}): CfnAssetModel = CfnAssetModel.Builder.create(this,
    id).apply(initializer).build()
