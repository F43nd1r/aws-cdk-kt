package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CodeInterpreterCustom
import software.amazon.awscdk.services.bedrockagentcore.CodeInterpreterCustomProps
import software.constructs.Construct

@Generated
public fun Construct.codeInterpreterCustom(id: String, initializer: @AwsCdkDsl CodeInterpreterCustom.() -> Unit = {}): CodeInterpreterCustom = CodeInterpreterCustom(this, id).apply(initializer)

@Generated
public fun Construct.codeInterpreterCustom(
  id: String,
  props: CodeInterpreterCustomProps,
  initializer: @AwsCdkDsl CodeInterpreterCustom.() -> Unit = {},
): CodeInterpreterCustom = CodeInterpreterCustom(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCodeInterpreterCustom(id: String, initializer: @AwsCdkDsl CodeInterpreterCustom.Builder.() -> Unit = {}): CodeInterpreterCustom = CodeInterpreterCustom.Builder.create(this, id).apply(initializer).build()
