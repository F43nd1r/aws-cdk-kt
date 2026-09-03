package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnWorker
import software.amazon.awscdk.services.deadline.CfnWorkerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorker(
  id: String,
  props: CfnWorkerProps,
  initializer: @AwsCdkDsl CfnWorker.() -> Unit = {},
): CfnWorker = CfnWorker(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorker(id: String, initializer: @AwsCdkDsl CfnWorker.Builder.() -> Unit = {}): CfnWorker = CfnWorker.Builder.create(this, id).apply(initializer).build()
