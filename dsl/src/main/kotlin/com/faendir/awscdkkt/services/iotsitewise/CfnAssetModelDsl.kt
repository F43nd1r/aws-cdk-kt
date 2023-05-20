@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
import software.constructs.Construct

public fun Construct.cfnAssetModel(
  id: String,
  props: CfnAssetModelProps,
  initializer: CfnAssetModel.() -> Unit = {},
): CfnAssetModel = CfnAssetModel(this, id, props).apply(initializer)
