package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeDeployBlueGreenHook(
  id: String,
  props: CfnCodeDeployBlueGreenHookProps,
  initializer: @AwsCdkDsl CfnCodeDeployBlueGreenHook.() -> Unit = {},
): CfnCodeDeployBlueGreenHook = CfnCodeDeployBlueGreenHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeDeployBlueGreenHook(id: String, initializer: @AwsCdkDsl
    CfnCodeDeployBlueGreenHook.Builder.() -> Unit = {}): CfnCodeDeployBlueGreenHook =
    CfnCodeDeployBlueGreenHook.Builder.create(this, id).apply(initializer).build()
