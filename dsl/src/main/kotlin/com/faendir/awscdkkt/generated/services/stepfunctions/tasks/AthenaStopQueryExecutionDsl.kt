package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.athenaStopQueryExecution(
  id: String,
  props: AthenaStopQueryExecutionProps,
  initializer: @AwsCdkDsl AthenaStopQueryExecution.() -> Unit = {},
): AthenaStopQueryExecution = AthenaStopQueryExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAthenaStopQueryExecution(id: String, initializer: @AwsCdkDsl
    AthenaStopQueryExecution.Builder.() -> Unit = {}): AthenaStopQueryExecution =
    AthenaStopQueryExecution.Builder.create(this, id).apply(initializer).build()
