package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScript(
  id: String,
  props: CfnScriptProps,
  initializer: @AwsCdkDsl CfnScript.() -> Unit = {},
): CfnScript = CfnScript(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScript(id: String, initializer: @AwsCdkDsl CfnScript.Builder.() -> Unit
    = {}): CfnScript = CfnScript.Builder.create(this, id).apply(initializer).build()
