@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnScene
import software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
import software.constructs.Construct

public fun Construct.cfnScene(
  id: String,
  props: CfnSceneProps,
  initializer: CfnScene.() -> Unit = {},
): CfnScene = CfnScene(this, id, props).apply(initializer)
