package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnCodeInterpreterCustom
import software.amazon.awscdk.services.bedrockagentcore.CfnCodeInterpreterCustomProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeInterpreterCustom(
  id: String,
  props: CfnCodeInterpreterCustomProps,
  initializer: @AwsCdkDsl CfnCodeInterpreterCustom.() -> Unit = {},
): CfnCodeInterpreterCustom = CfnCodeInterpreterCustom(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeInterpreterCustom(id: String, initializer: @AwsCdkDsl CfnCodeInterpreterCustom.Builder.() -> Unit = {}): CfnCodeInterpreterCustom = CfnCodeInterpreterCustom.Builder.create(this, id).apply(initializer).build()
