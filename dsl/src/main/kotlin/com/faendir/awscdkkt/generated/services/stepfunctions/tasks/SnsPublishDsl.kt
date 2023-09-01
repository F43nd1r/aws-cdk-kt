package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublish
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps
import software.constructs.Construct

@Generated
public fun Construct.snsPublish(
  id: String,
  props: SnsPublishProps,
  initializer: @AwsCdkDsl SnsPublish.() -> Unit = {},
): SnsPublish = SnsPublish(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSnsPublish(id: String, initializer: @AwsCdkDsl
    SnsPublish.Builder.() -> Unit = {}): SnsPublish = SnsPublish.Builder.create(this,
    id).apply(initializer).build()
