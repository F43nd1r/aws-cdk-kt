package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.athenaGetQueryExecution(
  id: String,
  props: AthenaGetQueryExecutionProps,
  initializer: @AwsCdkDsl AthenaGetQueryExecution.() -> Unit = {},
): AthenaGetQueryExecution = AthenaGetQueryExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAthenaGetQueryExecution(id: String, initializer: @AwsCdkDsl
    AthenaGetQueryExecution.Builder.() -> Unit = {}): AthenaGetQueryExecution =
    AthenaGetQueryExecution.Builder.create(this, id).apply(initializer).build()
