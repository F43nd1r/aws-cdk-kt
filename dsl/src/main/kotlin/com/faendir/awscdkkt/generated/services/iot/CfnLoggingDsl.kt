package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnLogging
import software.amazon.awscdk.services.iot.CfnLoggingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogging(
  id: String,
  props: CfnLoggingProps,
  initializer: @AwsCdkDsl CfnLogging.() -> Unit = {},
): CfnLogging = CfnLogging(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogging(id: String, initializer: @AwsCdkDsl CfnLogging.Builder.() -> Unit = {}): CfnLogging = CfnLogging.Builder.create(this, id).apply(initializer).build()
