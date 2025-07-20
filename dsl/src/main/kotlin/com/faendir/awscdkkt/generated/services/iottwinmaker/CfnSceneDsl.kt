package com.faendir.awscdkkt.generated.services.iottwinmaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnScene
import software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScene(
  id: String,
  props: CfnSceneProps,
  initializer: @AwsCdkDsl CfnScene.() -> Unit = {},
): CfnScene = CfnScene(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScene(id: String, initializer: @AwsCdkDsl CfnScene.Builder.() -> Unit = {}): CfnScene = CfnScene.Builder.create(this, id).apply(initializer).build()
