package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.athenaStartQueryExecution(
  id: String,
  props: AthenaStartQueryExecutionProps,
  initializer: @AwsCdkDsl AthenaStartQueryExecution.() -> Unit = {},
): AthenaStartQueryExecution = AthenaStartQueryExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAthenaStartQueryExecution(id: String, initializer: @AwsCdkDsl
    AthenaStartQueryExecution.Builder.() -> Unit = {}): AthenaStartQueryExecution =
    AthenaStartQueryExecution.Builder.create(this, id).apply(initializer).build()
