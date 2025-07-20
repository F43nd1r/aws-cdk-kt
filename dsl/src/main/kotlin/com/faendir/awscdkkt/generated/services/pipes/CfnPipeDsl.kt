package com.faendir.awscdkkt.generated.services.pipes

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPipe(
  id: String,
  props: CfnPipeProps,
  initializer: @AwsCdkDsl CfnPipe.() -> Unit = {},
): CfnPipe = CfnPipe(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPipe(id: String, initializer: @AwsCdkDsl CfnPipe.Builder.() -> Unit = {}): CfnPipe = CfnPipe.Builder.create(this, id).apply(initializer).build()
