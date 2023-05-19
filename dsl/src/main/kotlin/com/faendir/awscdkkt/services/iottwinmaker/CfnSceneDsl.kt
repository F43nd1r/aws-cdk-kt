@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
