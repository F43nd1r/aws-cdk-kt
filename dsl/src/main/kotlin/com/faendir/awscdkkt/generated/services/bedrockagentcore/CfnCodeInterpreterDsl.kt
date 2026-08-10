package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnCodeInterpreter
import software.amazon.awscdk.services.bedrockagentcore.CfnCodeInterpreterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeInterpreter(id: String, initializer: @AwsCdkDsl CfnCodeInterpreter.() -> Unit = {}): CfnCodeInterpreter = CfnCodeInterpreter(this, id).apply(initializer)

@Generated
public fun Construct.cfnCodeInterpreter(
  id: String,
  props: CfnCodeInterpreterProps,
  initializer: @AwsCdkDsl CfnCodeInterpreter.() -> Unit = {},
): CfnCodeInterpreter = CfnCodeInterpreter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeInterpreter(id: String, initializer: @AwsCdkDsl CfnCodeInterpreter.Builder.() -> Unit = {}): CfnCodeInterpreter = CfnCodeInterpreter.Builder.create(this, id).apply(initializer).build()
