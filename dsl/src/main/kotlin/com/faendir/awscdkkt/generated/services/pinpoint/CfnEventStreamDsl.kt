package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEventStream
import software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventStream(
  id: String,
  props: CfnEventStreamProps,
  initializer: @AwsCdkDsl CfnEventStream.() -> Unit = {},
): CfnEventStream = CfnEventStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventStream(id: String, initializer: @AwsCdkDsl CfnEventStream.Builder.() -> Unit = {}): CfnEventStream = CfnEventStream.Builder.create(this, id).apply(initializer).build()
