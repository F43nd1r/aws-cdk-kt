package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnSessionLogger
import software.amazon.awscdk.services.workspacesweb.CfnSessionLoggerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSessionLogger(
  id: String,
  props: CfnSessionLoggerProps,
  initializer: @AwsCdkDsl CfnSessionLogger.() -> Unit = {},
): CfnSessionLogger = CfnSessionLogger(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSessionLogger(id: String, initializer: @AwsCdkDsl CfnSessionLogger.Builder.() -> Unit = {}): CfnSessionLogger = CfnSessionLogger.Builder.create(this, id).apply(initializer).build()
