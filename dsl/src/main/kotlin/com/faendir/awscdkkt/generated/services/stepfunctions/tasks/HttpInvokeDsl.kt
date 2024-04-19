package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.HttpInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.HttpInvokeProps
import software.constructs.Construct

@Generated
public fun Construct.httpInvoke(
  id: String,
  props: HttpInvokeProps,
  initializer: @AwsCdkDsl HttpInvoke.() -> Unit = {},
): HttpInvoke = HttpInvoke(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpInvoke(id: String, initializer: @AwsCdkDsl
    HttpInvoke.Builder.() -> Unit = {}): HttpInvoke = HttpInvoke.Builder.create(this,
    id).apply(initializer).build()
