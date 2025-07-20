package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceSpecificLogging(
  id: String,
  props: CfnResourceSpecificLoggingProps,
  initializer: @AwsCdkDsl CfnResourceSpecificLogging.() -> Unit = {},
): CfnResourceSpecificLogging = CfnResourceSpecificLogging(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceSpecificLogging(id: String, initializer: @AwsCdkDsl CfnResourceSpecificLogging.Builder.() -> Unit = {}): CfnResourceSpecificLogging = CfnResourceSpecificLogging.Builder.create(this, id).apply(initializer).build()
