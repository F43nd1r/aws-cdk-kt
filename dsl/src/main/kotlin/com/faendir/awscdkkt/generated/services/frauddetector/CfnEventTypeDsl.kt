package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventType(
  id: String,
  props: CfnEventTypeProps,
  initializer: @AwsCdkDsl CfnEventType.() -> Unit = {},
): CfnEventType = CfnEventType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventType(id: String, initializer: @AwsCdkDsl CfnEventType.Builder.() -> Unit = {}): CfnEventType = CfnEventType.Builder.create(this, id).apply(initializer).build()
